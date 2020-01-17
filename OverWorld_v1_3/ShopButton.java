import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shopButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShopButton extends Actor
{
        ShopWorld myWorld;
    
    /**
     * Act - do whatever the SettingsButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        mouseListener();
    }
    
    public void mouseListener() {
        if(Greenfoot.mousePressed(this)){
            ((MainMenu)getWorld()).stopMusic();
            Greenfoot.setWorld(new ShopWorld());
        }
    }
}
