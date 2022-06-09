import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.Serializable;
import java.util.ArrayList;

public class GamePainel extends JPanel implements Serializable, Runnable, KeyListener {
    private static final long serialVersionUID = 1L;
    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;
    private Thread thread;
    private boolean running;
    private boolean right = true;
    private boolean left = false;
    private boolean up = false;
    private boolean down = false;

    private BodyPart bodyPart;
    private ArrayList<BodyPart> snake;

    private int xCoordinate = 10;
    private int yCoordinate = 10;
    private int size = 5;
    private int ticks = 0;
    public GamePainel(){
        setFocusable(true);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        addKeyListener(this);
        snake = new ArrayList<>();
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
        if(this.snake.size() == 0){
            bodyPart = new BodyPart(xCoordinate, yCoordinate, 10);
            this.snake.add(bodyPart);
        }
        ticks++;
        if(ticks > 250000){
            if (right) xCoordinate++;
            if(left) xCoordinate--;
            if(up) yCoordinate--;
            if(down) yCoordinate++;

            ticks = 0;
            bodyPart = new BodyPart(xCoordinate, yCoordinate, 10);
            this.snake.add(bodyPart);

            if(this.snake.size() > this.size){
                this.snake.remove(0);
            }
        }
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
        for(int i = 0; i < this.snake.size(); i++){
            snake.get(i).draw(graphics);
        }
    }

    @Override
    public void run() {
        while(this.running){
            tick();
            repaint();
        }
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        int key = keyEvent.getKeyCode();
        if(key == KeyEvent.VK_RIGHT && !left){
            right = true;
            up = false;
            down = false;
        }
        if(key == KeyEvent.VK_LEFT && !right){
            left = true;
            up = false;
            down = false;
        }
        if(key == KeyEvent.VK_UP && !down){
            up = true;
            left = false;
            right = false;
        }
        if(key == KeyEvent.VK_DOWN && !up){
            down = true;
            left = false;
            right = false;
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
