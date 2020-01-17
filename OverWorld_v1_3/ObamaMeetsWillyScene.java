import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ObamaMeetsWillyScene here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObamaMeetsWillyScene extends World
{

    /**
     * Constructor for objects of class ObamaMeetsWillyScene.
     * 
     */
    public ObamaMeetsWillyScene()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1, false); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MeetsWillemGif meetsWillemGif = new MeetsWillemGif();
        addObject(meetsWillemGif,640,360);
    }
}
