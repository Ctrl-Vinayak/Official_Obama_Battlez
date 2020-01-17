import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HPplayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HPplayer extends Actor
{
    public HPplayer()
    {
        GreenfootImage image = getImage();
        image.scale((int) Math.round(image.getWidth() * 1.6), image.getHeight());
    }     
}
