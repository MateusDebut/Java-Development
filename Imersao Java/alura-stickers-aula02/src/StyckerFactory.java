import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class StyckerFactory implements Runnable{

    private int beggin;
    private int end;
    private List<Filme> list;

    private List<BufferedImage> imageList;

    public StyckerFactory() {
    }

    public StyckerFactory(int beggin, int end, List<Filme> list, List<BufferedImage> imageList) {
        this.beggin = beggin;
        this.end = end;
        this.list = list;
        this.imageList = imageList;
    }

    @Override
    public void run() {
        if(imageList == null){
            imageList = new ArrayList<>();
        }

        for (int i = beggin; i < end; i++) {
            BufferedImage originalImage = null;
            try {
                originalImage = ImageIO.read(new URL(list.get(i).getImage()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            int width = originalImage.getWidth();
            int height = originalImage.getHeight() + 50;
            BufferedImage newImage = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);

            Graphics2D graphics = (Graphics2D) newImage.getGraphics();
            graphics.drawImage(originalImage, 0, 0, null);

            var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 20);
            graphics.setColor(Color.BLUE);
            graphics.drawString("BlaBla", (int) (width * 0.35), height - 10);
            imageList.add(newImage);
        }
    }
}
