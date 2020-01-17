import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HPBar_enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HPBar_enemy extends Actor
{
    int health = 200;
    int healthbarwidth = 400;
    int healthbarheight = 15;
    int pixelsPerHealthpoint = (int)healthbarwidth/health;
    /**
     * Act - do whatever the HPBar_player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HPBar_enemy() 
    {
        update();
    }

    public void update()
    {
        setImage(new GreenfootImage(402,17));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.BLACK);
        myImage.drawRect(0,0, healthbarwidth +1, healthbarheight+1);
        myImage.setColor(Color.GREEN);
        myImage.fillRect(1,1,health*pixelsPerHealthpoint, healthbarheight);
    }
}
