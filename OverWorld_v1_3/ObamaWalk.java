import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ObamaWalk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObamaWalk extends Actor
{
    
    private GifImage myGif = new GifImage("obama_walk2.gif");
    /**
     * Act - do whatever the ObamaWalk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        setImage(myGif.getCurrentImage());
    }    
}
