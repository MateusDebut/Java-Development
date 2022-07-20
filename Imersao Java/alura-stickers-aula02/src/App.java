import org.codehaus.jackson.map.ObjectMapper;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        String url = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";
        URI uri = URI.create(url);

        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest requst = HttpRequest.newBuilder(uri).GET().build();
        HttpResponse<String> response = client.send(requst, HttpResponse.BodyHandlers.ofString());
        String body = response.body();

        ObjectMapper objectMapper = new ObjectMapper();
        ResponseDTO responseDTO = objectMapper.readValue(body, ResponseDTO.class);
        List<Filme> filmes = responseDTO.getItems();
        int nucleos = Runtime.getRuntime().availableProcessors();
        System.out.println("nucleos: " + nucleos);

        long ti = System.currentTimeMillis();

        int valorInicial = 1;
        int valorFinal = 180;

        List<BufferedImage> imageList = new ArrayList<>();
        int trabalho = valorFinal/valorInicial;


        Collection<Thread> threads = new ArrayList<>();
        for (int i = 1; i <= nucleos; i++) {
            int qtdPorThread = Math.round(trabalho / nucleos);

            int fim = qtdPorThread * i;
            int ini = (fim - qtdPorThread) + 1;

            Thread thread = new Thread(new StyckerFactory(ini, fim, filmes, imageList));
            thread.setName("Thread "+i);
            threads.add(thread);
        }

        for (Thread th : threads) {
            th.start();
        }

        for (Thread th : threads) {
            try {
                th.join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        System.out.println("tempo: "+(System.currentTimeMillis()-ti));

        for (int i = 0; i < imageList.size(); i++){
            ImageIO.write(imageList.get(i), "png", new File("saida/" + String.valueOf(i)));
        }
    }
}