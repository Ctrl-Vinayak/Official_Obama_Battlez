import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OverWorldP1 extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public OverWorldP1() {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1, false); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        OverWorld_part1 owp1 = new OverWorld_part1();
        addObject(owp1,-380,290);
        Sprite sprite = new Sprite();
        addObject(sprite,640,360);
    }
}
