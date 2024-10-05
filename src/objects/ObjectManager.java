package objects;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.util.ArrayList;

public class ObjectManager {
    private BufferedImage bulletImg;
    private ArrayList<Projectile> projectiles  new ArrayList<>();
    public ObjectManager() {
        loadImgs();
    }

    private void loadImgs() {
        InputStream is = getClass().getResourceAsStream("/img.png");
        try {
            bulletImg = ImageIO.read(is);
    }
}
