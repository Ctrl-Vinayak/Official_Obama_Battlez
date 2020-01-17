import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OverWorld_part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OverWorld_part2 extends Actor {
    
    private GreenfootImage owp2 = getImage();
    private int frame = 0;
    
    /**
     * Act - do whatever the OverWorld_part2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        if(Greenfoot.isKeyDown("W")) {
            setLocation(getX(), getY() + 4);
            owp2.scale((int) Math.floor(owp2.getWidth() * 1.005), (int) Math.floor(owp2.getHeight() * 1.005));
            if(getY() > 610) {
                setLocation(getX(), getY() - 4);
                Greenfoot.setWorld(new ObamaMeetsWillyScene());
                //battle starts...
                //to the battle world!
            }
            //sprite.setLocation(sprite.getX(), sprite.getY() - 4);
        }
        if(Greenfoot.isKeyDown("S")) {
            setLocation(getX(), getY() - 4);
            owp2.scale((int) Math.floor(owp2.getWidth() / 1.005), (int) Math.floor(owp2.getHeight() / 1.005));

            if(getY() < 300) {
                setLocation(getX(), getY() + 4);
            }
                //sprite.setLocation(spriteX, spriteY + 4);
        }
        if(Greenfoot.isKeyDown("A")) {
            setLocation(getX() + 4, getY());
            if(getX() > 800) {
                setLocation(getX() - 4, getY());
            }
            //sprite.setLocation(spriteX - 4, spriteY);
        }
        if(Greenfoot.isKeyDown("D")) {
            setLocation(getX() - 4, getY());
            if(getX() < 450) {
                setLocation(getX() + 4, getY());
            }
            //sprite.setLocation(spriteX + 4, spriteY);
        }
        System.out.println(getX() + " x " + getY());
    }
}
