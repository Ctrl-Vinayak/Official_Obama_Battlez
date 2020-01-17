import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MlgShopWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MlgShopWorld extends World
{

    /**
     * Constructor for objects of class MlgShopWorld.
     * 
     */
    public MlgShopWorld()
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
        Sprite sprite = new Sprite();
        addObject(sprite,324,890);
        MlgInterior mlgInterior = new MlgInterior();
        addObject(mlgInterior,852,-180);
        removeObject(sprite);
        addObject(sprite,640,360);
    }
}
