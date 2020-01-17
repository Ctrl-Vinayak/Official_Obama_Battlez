import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BattleScene extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public BattleScene()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        /*
        UIPlayer uIPlayer = new UIPlayer();
        addObject(uIPlayer,980,410);
        UIEnemy uIEnemy = new UIEnemy();
        addObject(uIEnemy,300,100);

        Obama_battle obama_battle = new Obama_battle();
        addObject(obama_battle,321,356);
        Willem_battle willem_battle = new Willem_battle();
        addObject(willem_battle,881,130);

        UIPlayer_name uIPlayer_name = new UIPlayer_name();
        addObject(uIPlayer_name,858,347);
        UIEnemy_name uIEnemy_name = new UIEnemy_name();
        addObject(uIEnemy_name,155,28);
        HPBar_player hPBar_player = new HPBar_player();
        addObject(hPBar_player,1040,390);
         */
        UIPlayer uIPlayer = new UIPlayer();
        addObject(uIPlayer,980,410);
        UIEnemy uIEnemy = new UIEnemy();
        addObject(uIEnemy,300,100);

        Obama_battle obama_battle = new Obama_battle();
        addObject(obama_battle,321,356);
        Willem_battle willem_battle = new Willem_battle();
        addObject(willem_battle,881,130);

        UIPlayer_name uIPlayer_name = new UIPlayer_name();
        addObject(uIPlayer_name,858,347);
        UIEnemy_name uIEnemy_name = new UIEnemy_name();
        addObject(uIEnemy_name,155,28);
        uIEnemy.setLocation(204,74);
        HPenemy hPenemy = new HPenemy();
        addObject(hPenemy,280,74);
        uIEnemy.setLocation(290,74);
        HPplayer hPplayer = new HPplayer();
        addObject(hPplayer,980,389);

        HPBar_player hPBar_player = new HPBar_player();
        addObject(hPBar_player,1040,390);

        HPBar_enemy hPBar_enemy = new HPBar_enemy();
        addObject(hPBar_enemy,340,73);
        UI_tekst uI_tekst = new UI_tekst();
        addObject(uI_tekst,300,596);
        UI_Battle uI_Battle = new UI_Battle();
        addObject(uI_Battle,943,583);
    }
}
