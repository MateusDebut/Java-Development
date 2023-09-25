package cliente;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClienteTarefas {


    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("localhost", 12345);
        System.out.println("Conexão estabelecida ");

        Thread threadEnvioDados = new Thread(new TarefaEnvioDados(socket));
        threadEnvioDados.start();

        Thread threadRecebimentoDados = new Thread(new TarefaRecebimentoDados(socket));
        threadRecebimentoDados.start();

        threadEnvioDados.join();
        System.out.println("fechando o socket");
    }
}
