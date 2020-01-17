import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{
    public GreenfootSound backgroundMusic = new GreenfootSound("sounds/POKEMON_THEME_SHITTYFLUTED.mp3");
    public static boolean musicPlayer = true;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MainMenu()
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
        MenuSettings menuSettings = new MenuSettings();
        addObject(menuSettings,552,97);
        startButton startButton = new startButton();
        addObject(startButton,615,276);
        ExitButton exitButton = new ExitButton();
        addObject(exitButton,592,658);
        SettingsButton settingsButton = new SettingsButton();
        addObject(settingsButton,595,511);
        ShopButton shopButton = new ShopButton();
        addObject(shopButton,613,389);
        ObamaWalk obamaWalk = new ObamaWalk();
        addObject(obamaWalk,620,181);
    }

    public void act()
    {
        musicPlayer = true;
        sound();
        //stopMusic();
    }
    
    public void stopMusic() {
            backgroundMusic.stop();
    }

    public void sound()
    {
        backgroundMusic.setVolume (25);
        if(musicPlayer == true){
            backgroundMusic.playLoop();
            musicPlayer = false;
        }
    }
}
