package cliente;

import java.net.Socket;
import java.util.Scanner;

public class TarefaRecebimentoDados implements Runnable {
    private Socket socket;
    public TarefaRecebimentoDados(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run(){
        try {
            System.out.println("Recebendo dados do servidor...");
            Scanner respostaServidor = new Scanner(socket.getInputStream());

            while (respostaServidor.hasNextLine()) {
                String linha = respostaServidor.nextLine();
                System.out.println(linha);
            }
        } catch (Exception exception){
            throw new RuntimeException(exception.getMessage());
        }
    }
}
