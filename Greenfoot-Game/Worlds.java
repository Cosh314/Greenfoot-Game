import greenfoot.*;
public class Worlds extends World {
    public Worlds() {
        super(20, 15, 50);
        Greenfoot.setSpeed(30);
        setBackground("images/Background.png");
        prepare();
    }
    public void reset() {
        removeObjects(getObjects(null));
        prepare();
    }
    public void prepare() { }
}