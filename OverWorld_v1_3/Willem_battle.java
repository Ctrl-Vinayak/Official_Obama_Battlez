
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class willem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Willem_battle extends Actor
{
    public short pressOnceEnter = -1;
    public int frameCheck = 0;
    private short total60;
    private short totalRotation = 0;
    private short totalclicks = 0;
    public boolean button1Click = false;
    public boolean button2Click = false;
    public boolean button3Click = false;
    public boolean button4Click = false;
    private short asdf = 1;
    
    public Willem_battle()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2, image.getHeight()/2);
        getImage().mirrorHorizontally();
        setImage(image);
    }
    
    /**
     * Act - do whatever the willem wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        frameCheck++;
        keyEvents();
        move();
    }    
    
    public void move() {
        int y = getY();
        int x = getX();
        
        if(pressOnceEnter == 0 && button1Click == true) {
            
            if(frameCheck == 30) {
                getImage().mirrorHorizontally();
                x-=100;
            }
            
            if(frameCheck == 100){
                getImage().mirrorHorizontally();
                setRotation(-45);
                x-=100;
                y+=50;
            }
            
            //terug
            if(frameCheck == 120){
                setRotation(0);
                x+=200;
                y-=50;
                
                getImage().mirrorHorizontally();
                getImage().mirrorHorizontally();
                frameCheck = 0;
                pressOnceEnter = 1;
                button1Click = false;
                frameCheck = 0;
                asdf = 2;
            }
        }
        if(pressOnceEnter == 0 && button2Click == true){
        //needs loop for first spin
            for(int i = 0; i < 70; i+=20) {
                if(frameCheck == i) {
                    getImage().mirrorVertically();
                }
            }
            for(int i = -10; i < 80; i+=20) {
                if(frameCheck == i) {
                    getImage().mirrorHorizontally();
                }
            }
            //second pattern
            for(int i = 70; i < 130; i+=10) {
                if(frameCheck == i) {
                    getImage().mirrorVertically();
                    x-=40;
                    y+=22;
                    totalRotation++;
                    if(totalRotation == 5){
                        pressOnceEnter = 1;
                        button2Click = false;
                        setRotation(0);
                        x+=40 * 5;
                        y-=22 * 5;
                        totalRotation = 0;
                    }
                }
            }
            if(frameCheck == 120){
                frameCheck = 0;
                total60++;
                x-= 38 * total60;
                y+= 34;
                
                if(total60 == 5){
                    total60 = 0;
                }
            }
            asdf = 4;
        }
        if(pressOnceEnter == 0 && button3Click == true) {
            
            if(frameCheck == 30) {
                getImage().mirrorHorizontally();
                x-=100;
            }
            
            if(frameCheck == 60){
                getImage().mirrorHorizontally();
                setRotation(-45);
                x+=200;
            }
            if(frameCheck == 90){
                getImage().mirrorHorizontally();
                setRotation(45);
                x-=200;
            }
            
            //terug
            if(frameCheck == 100){
                setRotation(0);
                x+=100;
                getImage().mirrorHorizontally();
                frameCheck = 0;
                pressOnceEnter = 1;
                button3Click = false;
                asdf = 4;
            }
        }
        if(pressOnceEnter == 0 && button4Click == true) {
            getWorld().setPaintOrder(Willem_battle.class, Obama_battle.class);
            if(frameCheck == 10) {
                x-=100;
            }
            if(frameCheck == 20) {
                x-=100;
            }
            if(frameCheck == 30) {
                x-=50;
            }
            if(frameCheck == 40) {
                x-=50;
                y+=22 * 5;
            }
            if(frameCheck == 50) {
                y-=22 * 5;
            }
            //terug
            if(frameCheck == 100){
                setRotation(0);
                x+=300;
                getWorld().setPaintOrder(Obama_battle.class, Willem_battle.class);
                //getImage().mirrorHorizontally();
                frameCheck = 0;
                pressOnceEnter = 1;
                button4Click = false;
            }
        }
        setLocation(x, y);
    }
    
    public void keyEvents() {
        if(asdf == 1){
            pressOnceEnter = 0;
            frameCheck = 0;
            totalclicks++;
            button1Click = true;
        }
        if(asdf == 2) {
            pressOnceEnter = 0;
            frameCheck = 0;
            totalclicks++;
            button2Click = true;
        }
        if(asdf == 3) {
            pressOnceEnter = 0;
            frameCheck = 0;
            totalclicks++;
            button3Click = true;
        }
        if(asdf == 4) {
            pressOnceEnter = 0;
            frameCheck = 0;
            totalclicks++;
            button4Click = true;
        }
    }
}

//if(Greenfoot.isKeyDown("enter")){}

