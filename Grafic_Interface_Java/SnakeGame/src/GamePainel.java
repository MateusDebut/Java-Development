import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public class GamePainel extends JPanel implements Serializable, Runnable {
    private static final long serialVersionUID = 1L;
    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;
    private Thread thread;
    private boolean running;
    public GamePainel(){
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        start();
    }

    public void start(){
        this.running = true;
        thread = new Thread(this);
        thread.start();
    }

    public void stop(){
        this.running = false;
        try{
            thread.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public void tick(){

    }

    public void paint(Graphics graphics){
        graphics.clearRect(0,0,WIDTH,HEIGHT);
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0,0,WIDTH,HEIGHT);

        for(int i = 0; i < WIDTH/10; i++){
            graphics.drawLine(i * 10, 0, i*10, HEIGHT);
        }

        for(int i = 0; i < HEIGHT/10; i++){
            graphics.drawLine(0, i*10, HEIGHT, i * 10);
        }
    }

    @Override
    public void run() {
        while(this.running){
            tick();
            repaint();
        }
    }
}
