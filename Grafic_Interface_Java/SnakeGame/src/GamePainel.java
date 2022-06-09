import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public class GamePainel extends JPanel implements Serializable, Runnable {
    private static final long serialVersionUID = 1L;
    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;
    public GamePainel(){
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    public void start(){

    }

    public void stop(){

    }

    public void tick(){

    }

    public void paint(Graphics graphics){
        for(int i = 0; i < WIDTH/10; i++){
            graphics.drawLine(i * 10, 0, i*10, HEIGHT);
        }

        for(int i = 0; i < HEIGHT/10; i++){
            graphics.drawLine(0, i*10, HEIGHT, i * 10);
        }
    }

    @Override
    public void run() {

    }
}
