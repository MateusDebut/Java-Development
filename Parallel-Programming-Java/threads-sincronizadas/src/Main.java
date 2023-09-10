public class Main {
    public static void main(String[] args) {
        Banheiro banheiro = new Banheiro();
        Thread thread1 = new Thread(new TarefaFazNumero1(banheiro), "Mateus");
        Thread thread2 = new Thread(new TarefaFazNumero2(banheiro), "Monica");

        thread1.start();
        thread2.start();
    }
}
