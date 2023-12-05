package Transfo1;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CredentialsRetrieval {

    public static void main(String[] args) {
        String owner = "zakaria68K";
        String repository = "dec";

        try {
            String pomContent = getPomContent(owner, repository);
            System.out.println("pom.xml Content:\n" + pomContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getPomContent(String owner, String repository) throws IOException {
        String apiUrl = "https://raw.githubusercontent.com/" + owner + "/" + repository + "/master/pom.xml";

        // Create a temporary file to store the content
        Path tempFile = Files.createTempFile("pom", ".xml");

        try (InputStream in = new URL(apiUrl).openStream()) {
            // Copy content from URL to the temporary file
            Files.copy(in, tempFile, StandardCopyOption.REPLACE_EXISTING);
        }

        // Read the content of the temporary file
        byte[] encodedBytes = Files.readAllBytes(tempFile);
        return new String(encodedBytes);
    }
}
