public class Tarefa implements Runnable {

    @Override
    public void run(){
        try {
            System.out.println("Uma tarefa foi iniciada");
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
