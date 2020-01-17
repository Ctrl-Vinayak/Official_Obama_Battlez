import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sprite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sprite extends Actor
{
    private GreenfootImage frontImg = new GreenfootImage("sprite_1.png");
    private GreenfootImage frontImg1 = new GreenfootImage("sprite_1_1.png");
    private GreenfootImage frontImg2 = new GreenfootImage("sprite_1_2.png");
    private GreenfootImage leftImg = new GreenfootImage("sprite_2.png");
    private GreenfootImage leftImg1 = new GreenfootImage("sprite_2_1.png");
    private GreenfootImage leftImg2 = new GreenfootImage("sprite_2_2.png");
    private GreenfootImage rightImg = new GreenfootImage("sprite_3.png");
    private GreenfootImage rightImg1 = new GreenfootImage("sprite_3_1.png");
    private GreenfootImage rightImg2 = new GreenfootImage("sprite_3_2.png");
    private GreenfootImage behindImg = new GreenfootImage("sprite_4.png");
    private GreenfootImage behindImg1 = new GreenfootImage("sprite_4_1.png");
    private GreenfootImage behindImg2 = new GreenfootImage("sprite_4_2.png");
    
    private short frames = 0;
    private int i = 0;
    private boolean isNormalSpeed = true;
    
    /**
     * Act - do whatever the Sprite wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        frames++;
        if(isNormalSpeed == true) {
            if(frames == 51) frames = 0;
        } else {
            if(frames == 56) frames = 0;
        }
        
        if (Greenfoot.isKeyDown("S")) {
            if(isNormalSpeed == true) {
                if(frames == 0) setImage(frontImg);
                if(frames == 10) setImage(frontImg1);
                if(frames == 20) setImage(frontImg2);
                if(frames == 30) setImage(frontImg);
                if(frames == 40) setImage(frontImg1);
                if(frames == 50) setImage(frontImg2);
            } else {
                if(frames == 0) setImage(frontImg);
                if(frames == 5) setImage(frontImg1);
                if(frames == 10) setImage(frontImg2);
                if(frames == 15) setImage(frontImg);
                if(frames == 20) setImage(frontImg1);
                if(frames == 25) setImage(frontImg2);
                if(frames == 30) setImage(frontImg);
                if(frames == 35) setImage(frontImg1);
                if(frames == 40) setImage(frontImg2);
                if(frames == 45) setImage(frontImg);
                if(frames == 50) setImage(frontImg1);
                if(frames == 55) setImage(frontImg2);
            }
        }
        if (Greenfoot.isKeyDown("D")) {
            if(isNormalSpeed == true) {
                if(frames == 0) setImage(leftImg);
                if(frames == 10) setImage(leftImg1);
                if(frames == 20) setImage(leftImg2);
                if(frames == 30) setImage(leftImg);
                if(frames == 40) setImage(leftImg1);
                if(frames == 50) setImage(leftImg2);
            } else {
                if(frames == 0) setImage(leftImg);
                if(frames == 5) setImage(leftImg1);
                if(frames == 10) setImage(leftImg2);
                if(frames == 15) setImage(leftImg);
                if(frames == 20) setImage(leftImg1);
                if(frames == 25) setImage(leftImg2);
                if(frames == 30) setImage(leftImg);
                if(frames == 35) setImage(leftImg1);
                if(frames == 40) setImage(leftImg2);
                if(frames == 45) setImage(leftImg);
                if(frames == 50) setImage(leftImg1);
                if(frames == 55) setImage(leftImg2);    
            }
        }
        if (Greenfoot.isKeyDown("A")) {
            if(isNormalSpeed == true) {
                if(frames == 0) setImage(rightImg);
                if(frames == 10) setImage(rightImg1);
                if(frames == 20) setImage(rightImg2);
                if(frames == 30) setImage(rightImg);
                if(frames == 40) setImage(rightImg1);
                if(frames == 50) setImage(rightImg2);
            } else {
                if(frames == 0) setImage(rightImg);
                if(frames == 5) setImage(rightImg1);
                if(frames == 10) setImage(rightImg2);
                if(frames == 15) setImage(rightImg);
                if(frames == 20) setImage(rightImg1);
                if(frames == 25) setImage(rightImg2);
                if(frames == 30) setImage(rightImg);
                if(frames == 35) setImage(rightImg1);
                if(frames == 40) setImage(rightImg2);
                if(frames == 45) setImage(rightImg);
                if(frames == 50) setImage(rightImg1);
                if(frames == 55) setImage(rightImg2);    
            }
        }
        if (Greenfoot.isKeyDown("W")) {
            if(isNormalSpeed == true) {
                if(frames == 0) setImage(behindImg);
                if(frames == 10) setImage(behindImg1);
                if(frames == 20) setImage(behindImg2);
                if(frames == 30) setImage(behindImg);
                if(frames == 40) setImage(behindImg1);
                if(frames == 50) setImage(behindImg2);
            } else {
                if(frames == 0) setImage(behindImg);
                if(frames == 5) setImage(behindImg1);
                if(frames == 10) setImage(behindImg2);
                if(frames == 15) setImage(behindImg);
                if(frames == 20) setImage(behindImg1);
                if(frames == 25) setImage(behindImg2);
                if(frames == 30) setImage(behindImg);
                if(frames == 35) setImage(behindImg1);
                if(frames == 40) setImage(behindImg2);
                if(frames == 45) setImage(behindImg);
                if(frames == 50) setImage(behindImg1);
                if(frames == 55) setImage(behindImg2);     
            }
        }
        
        /*
        if(frames == 40) frames = 0;
        
        if (Greenfoot.isKeyDown("S")) {
            if(isrun == true) {
                if(frames == 0) setImage(frontImg);
                if(frames == 5) setImage(frontImg1);
                if(frames == 10) setImage(frontImg);
                if(frames == 15) setImage(frontImg2);
                if(frames == 20) setImage(frontImg);
                if(frames == 25) setImage(frontImg1);
                if(frames == 30) setImage(frontImg);
                if(frames == 35) setImage(frontImg2);
            } else {
                if(frames == 0) setImage(frontImg);
                if(frames == 10) setImage(frontImg1);
                if(frames == 20) setImage(frontImg);
                if(frames == 30) setImage(frontImg2);
            }    
        }
        if (Greenfoot.isKeyDown("D")) {
            if(isrun == true) {
                if(frames == 0) setImage(leftImg);
                if(frames == 5) setImage(leftImg1);
                if(frames == 10) setImage(leftImg);
                if(frames == 15) setImage(leftImg2);
                if(frames == 20) setImage(leftImg);
                if(frames == 25) setImage(leftImg1);
                if(frames == 30) setImage(leftImg);
                if(frames == 35) setImage(leftImg2);
            } else {
                if(frames == 0) setImage(leftImg);
                if(frames == 10) setImage(leftImg1);
                if(frames == 20) setImage(leftImg);
                if(frames == 30) setImage(leftImg2);
            }
        }
        if (Greenfoot.isKeyDown("A")) {
            if(isrun == true) {
                if(frames == 0) setImage(rightImg);
                if(frames == 5) setImage(rightImg1);
                if(frames == 10) setImage(rightImg);
                if(frames == 15) setImage(rightImg2);
                if(frames == 20) setImage(rightImg);
                if(frames == 25) setImage(rightImg1);
                if(frames == 30) setImage(rightImg);
                if(frames == 35) setImage(rightImg2);
            } else {
                if(frames == 0) setImage(rightImg);
                if(frames == 10) setImage(rightImg1);
                if(frames == 20) setImage(rightImg);
                if(frames == 30) setImage(rightImg2);
            }
        }
        if (Greenfoot.isKeyDown("W")) {
            if(isrun == true) {
                if(frames == 0) setImage(behindImg);
                if(frames == 5) setImage(behindImg1);
                if(frames == 10) setImage(behindImg);
                if(frames == 15) setImage(behindImg2);
                if(frames == 20) setImage(behindImg);
                if(frames == 25) setImage(behindImg1);
                if(frames == 30) setImage(behindImg);
                if(frames == 35) setImage(behindImg2);
            } else {
                if(frames == 0) setImage(behindImg);
                if(frames == 10) setImage(behindImg1);
                if(frames == 20) setImage(behindImg);
                if(frames == 30) setImage(behindImg2);
            }
        }
        */
    }    
}
