public class Main {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa();
        Thread thread = new Thread(tarefa);
        thread.start();
    }
}
