import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class settingsMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class settingsMenu extends World
{

    /**
     * Constructor for objects of class settingsMenu.
     * 
     */
    public settingsMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);
        GreenfootImage bg = new GreenfootImage("background.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        InDev inDev = new InDev();
        addObject(inDev,666,213);
        BackButton backButton = new BackButton();
        addObject(backButton,676,389);
    }
}
