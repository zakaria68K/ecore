package Transfo1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class JenkinsCredentialRetrieval {

    public static void main(String[] args)throws Exception {
        // Chemin vers le fichier config.properties
        String cheminFichierProperties = "src/ressources/config.properties";

        // Charger les propriétés depuis le fichier
        Properties proprietes = new Properties();
        try (FileInputStream fichierInput = new FileInputStream(cheminFichierProperties)) {
            proprietes.load(fichierInput);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Récupérer la valeur de la propriété jenkins.api.token
        String tokenJenkins = proprietes.getProperty("jenkins.api.token");

     // Supprimer les guillemets s'ils sont présents
        tokenJenkins = tokenJenkins.replaceAll("\"", "");

       // System.out.println(tokenJenkins);
        String jenkinsUrl = "http://localhost:8080/";
        String username = "admin";
        String apiToken = tokenJenkins;
       

        String credentials = Base64.getEncoder().encodeToString((username + ":" + apiToken).getBytes(StandardCharsets.UTF_8));

        // Jenkins API URL to retrieve credentials in a specific domain
        String domain = "mde";
        String apiUrl = jenkinsUrl + "credentials/store/system/domain/" + domain + "/api/json?tree=credentials[id,description]";

        // Create HTTP client
        HttpClient client = HttpClient.newHttpClient();

        // Create HTTP request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .header("Authorization", "Basic " + credentials)
                .build();

        // Send HTTP request and receive response
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Check if the request was successful (HTTP status code 200)
        if (response.statusCode() == 200) {
            System.out.println("Credentials: " + response.body());
        } else {
            System.err.println("Failed to retrieve credentials. HTTP Status Code: " + response.statusCode());
            System.err.println("Error Response: " + response.body());
        }
        
    }
    
}
