import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        String url = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";
        URI uri = URI.create(url);

        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest requst = HttpRequest.newBuilder(uri).GET().build();
        HttpResponse<String> response = client.send(requst, HttpResponse.BodyHandlers.ofString());
        String body = response.body();

        ObjectMapper objectMapper = new ObjectMapper();
        ResponseDTO filmes = objectMapper.readValue(body, ResponseDTO.class);
        filmes.getItems().forEach(filme -> System.out.println(filme.getFullTitle()));

    }
}
