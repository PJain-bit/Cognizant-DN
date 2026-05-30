import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class Ex36_HttpClientGet {
    public static void main(String[] args) {
        // Task: Use HttpClient to make a GET request and print the response body text.
        // We will target a safe, standard public testing endpoint
        String testingUrl = "https://jsonplaceholder.typicode.com/posts/1";

        // Create a basic client instance setup configuration
        HttpClient client = HttpClient.newHttpClient();

        // Build the target endpoint network message query package wrapper details
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(testingUrl))
                .GET() // Define request type
                .build();

        System.out.println("Sending standard API HTTP GET request to " + testingUrl + "...");

        try {
            // Deliver request over transmission layers and capture the returned payload package data
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Display results status values cleanly on the application console view line
            System.out.println("\nHTTP Response Status Code: " + response.statusCode());
            System.out.println("HTTP Response Text Payload Content Body:");
            System.out.println(response.body());

        } catch (IOException | InterruptedException e) {
            System.out.println("Failed to fetch target API network context details: " + e.getMessage());
        }
    }
}
