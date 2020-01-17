import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UI_tekst here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UI_tekst extends Actor
{
    public static int timer = 0;
    public void act()
    {
        timer++;
        if(timer >= 600){
            setImage(new GreenfootImage("What will Obama Prism do?", 48, Color.BLACK, null));
        }

    }

    public UI_tekst()
    {
            setImage(new GreenfootImage("You are challanged by: \n WillemCube", 48, Color.BLACK, null));
    }
    public static int getTimer()
    {
       return timer;
    }
}
