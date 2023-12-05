package Transfo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

import kong.unirest.core.JsonNode;
import kong.unirest.core.Unirest;
import kong.unirest.core.UnirestException;
public class CredentialsRetrieval {

    public static void main(String[] args) {
        String owner = "zakaria68K";
        String repository = "dec";

        try {
            String pomContent = getPomContent(owner, repository);
            System.out.println("pom.xml Content:\n" + pomContent);
        } catch (UnirestException e) {
            e.printStackTrace();
        }
    }

    private static String getPomContent(String owner, String repository) throws UnirestException {
        String apiUrl = "https://api.github.com/repos/" + owner + "/" + repository + "/contents/pom.xml?ref=master";

        JsonNode jsonResponse = Unirest.get(apiUrl)
                .header("Accept", "application/vnd.github.v3+json")
                .asJson()
                .getBody();

        return extractContent(jsonResponse.toString());
    }

    private static String extractContent(String jsonResponse) {
        String base64Content = jsonResponse.substring(jsonResponse.indexOf("\"content\":\"") + 11, jsonResponse.indexOf("\",\"encoding\":\"base64\""));

        // Remove non-base64 characters
        base64Content = base64Content.replaceAll("[^A-Za-z0-9+/=]", "");

        // Add padding if needed
        int padding = (4 - base64Content.length() % 4) % 4;
        base64Content = base64Content + "=".repeat(padding);

        try {
            byte[] decodedBytes = Base64.getDecoder().decode(base64Content);
            return new String(decodedBytes);
        } catch (IllegalArgumentException e) {
            System.err.println("Error decoding base64 content: " + e.getMessage());
            return "Error decoding base64 content";
        }
    }
}
