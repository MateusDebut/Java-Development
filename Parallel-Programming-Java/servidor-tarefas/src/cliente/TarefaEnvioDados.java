package cliente;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class TarefaEnvioDados implements Runnable {

    private Socket socket;

    public TarefaEnvioDados(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run(){
        try {
            Scanner scanner = new Scanner(System.in);
            PrintStream saida = new PrintStream(socket.getOutputStream());

            while (scanner.hasNextLine()){
                String linha = scanner.nextLine();
                if(linha.isBlank()){
                    break;
                }
                saida.println(linha);
            }
        }catch (Exception exception){
            throw new RuntimeException();
        }

    }
}
