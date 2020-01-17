import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OverWorldP2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OverWorldP2 extends World
{

    /**
     * Constructor for objects of class OverWorldP2.
     * 
     */
    public OverWorldP2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280,720,1,false); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        OverWorld_part2 overWorld_part2 = new OverWorld_part2();
        addObject(overWorld_part2,640,360);
        Sprite sprite = new Sprite();
        addObject(sprite,640,600);
    }
}
