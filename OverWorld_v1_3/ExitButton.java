import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class exitButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExitButton extends Actor
{
    /**
     * Act - do whatever the exitButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        exit();        
    }

    public void exit()
    {
        if (Greenfoot.mousePressed(this))
        {
            System.exit(0);
        }
    }
}
