package objects;

import java.awt.geom.Rectangle2D;

import static utilz.Constants.Projectile.*;

public class Projectile {
    private int dir;
    private boolean active  = true;
    private Rectangle2D hitbox;

    public Projectile(int x, int y, int dir) {
        this.dir = dir;
        hitbox = new Rectangle2D.Float(x, y, BULLET_WIDTH, BULLET_HEIGHT);
    }
    public void updatePos(int x, int y) {
        hitbox.x += dir*SPEED;
    }

    public void setPos(int x, int y) {
        hitbox.x = x;
        hitbox.y = y;
    }

    public Rectangle2D.Float getHitbox() {
        return (Rectangle2D.Float) hitbox;
    }
}
