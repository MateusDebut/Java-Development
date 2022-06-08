import javax.swing.*;

public class Main {
    public Main(){
        JFrame frame = new JFrame();

        GamePainel gamePainel = new GamePainel();

        frame.add(gamePainel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Snake Game");
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
