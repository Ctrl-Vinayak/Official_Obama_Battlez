import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UI_Battle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UI_Battle extends Actor
{
    UI_tekst timer = new UI_tekst();
    private boolean isClicked = false;
    public UI_Battle()
    {
        setImage(new GreenfootImage("", 48, Color.BLACK, null));
    }

    public void act() 
    {
        if(timer.timer >= 600)
        {   
            if(isClicked == false){
                setImage(new GreenfootImage("Fight", 48, Color.BLACK, null));
                isClicked = true;  
            }
            if(Greenfoot.mouseClicked(this)){
                setImage(new GreenfootImage("Special Move Activated!!!", 48, Color.BLACK, null));
                
            }
        }
        if(timer.timer >= 700)
            {setImage(new GreenfootImage("Credit Scene", 48, Color.BLACK, null));}
        if(timer.timer >= 800){
            Greenfoot.setWorld(new CreditScene());
        }
    }   
}
