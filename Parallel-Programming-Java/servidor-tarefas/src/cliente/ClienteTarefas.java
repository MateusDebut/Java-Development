package cliente;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClienteTarefas {


    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        System.out.println("Conexão estabelecida");

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        socket.close();
    }
}
