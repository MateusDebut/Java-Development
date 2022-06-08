import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public class GamePainel extends JPanel implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    public GamePainel(){
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

}
