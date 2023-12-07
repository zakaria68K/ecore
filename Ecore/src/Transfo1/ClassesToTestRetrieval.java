package Transfo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassesToTestRetrieval {
    public static void main(String[] args) {
        // Create an instance of ClassesToTestRetrieval
        ClassesToTestRetrieval classesRetrieval = new ClassesToTestRetrieval();

        // Get the string from ClassesToTestRetrieval
        List<String> jsonResponse = classesRetrieval.retrieveFileNames();

        // Rest of your code...
        // ...
    }

    public List<String> retrieveFileNames() {
        String owner = "zakaria68K";
        String repository = "ecore";
        String path = "Ecore/src/Transfo1";

        String apiUrl = String.format("https://api.github.com/repos/%s/%s/contents/%s", owner, repository, path);

        try {
            String jsonResponse = readUrl(apiUrl);
            List<String> fileNames = getFileNames(jsonResponse);

         

            // Return the list of file names
            return fileNames;
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Return an empty list in case of an error
        return Collections.emptyList();
    }

    private static String readUrl(String urlString) throws IOException {
        StringBuilder content = new StringBuilder();
        URL url = new URL(urlString);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } finally {
            urlConnection.disconnect();
        }

        return content.toString();
    }

    private static List<String> getFileNames(String jsonResponse) {
        List<String> fileNames = new ArrayList<>();
        String regex = "\"name\":\"(.*?)\"";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(jsonResponse);

        while (matcher.find()) {
            fileNames.add(matcher.group(1));
        }

        return fileNames;
    }
}
