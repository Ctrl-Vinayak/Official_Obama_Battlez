import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HPenemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HPenemy extends Actor
{
    public HPenemy()
    {
        GreenfootImage image = getImage();
        image.scale((int) Math.round(image.getWidth() * 1.6), image.getHeight());
    }      
}
