package entities;

import utilz.LoadSave;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import static utilz.HelpMethods.*;
import static utilz.LoadSave.*;


public class Bullet {
    private int x, y;
    private float bulletSpeed = 6.0f;
    private Player player;
    private int[][] lvlData;

    private int direction;
    private boolean isActive;
    public BufferedImage shootAnimation;
    public Rectangle2D.Float hitbox;
    public Bullet(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.isActive = true;
        this.shootAnimation = LoadSave.GetSpriteAtlas(BALL);
    }

    public void render(Graphics g) {
        if (isActive) {
            g.drawImage(shootAnimation, x, y, null);
        }
    }

    public void update() {
        x += (int) (bulletSpeed*direction);
//        updateBulletXPos();
    }
    public void deactivate() {
        isActive = false;
    }
//    private void updateBulletXPos() {
//        if (CanMoveHere(hitbox.x + bulletSpeed, hitbox.y, hitbox.width, hitbox.height, lvlData))
//            hitbox.x += direction*bulletSpeed;
//        else
//            hitbox.x = GetEntityXPosNextToWall(hitbox, bulletSpeed);
//    }
    public void loadLvlData(int[][] lvlData) {
        this.lvlData = lvlData;
    }
    public boolean isActive() {
        return isActive;
    }

}
