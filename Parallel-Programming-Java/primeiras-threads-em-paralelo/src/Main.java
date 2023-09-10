public class Main {
    public static void main(String[] args) {
        String nome = "da";

        Thread thread1 = new Thread(new TarefaBuscaTextual("nomes_brasileiros.txt", nome));
        Thread thread2 = new Thread(new TarefaBuscaTextual("nomes_americanos.txt", nome));
        thread1.start();
        thread2.start();
    }
}
