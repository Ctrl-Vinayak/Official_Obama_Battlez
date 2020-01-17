import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OverWorld_part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OverWorld_part1 extends Actor {
    
    private GreenfootImage part1 = getImage();
    private GreenfootSound helloSound = new GreenfootSound("Hello - Sound Effect.mp3");
    private int spriteX;
    private int spriteY;

    public OverWorld_part1() {
        part1.scale(part1.getWidth() / 2, part1.getHeight() / 2);
    }

    /**
     * Act - do whatever the OverWorld_part1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        scroll();
    }

    private void scroll() {
        Actor sprite = getOneIntersectingObject(Sprite.class);
        int x = getX();
        int y = getY();
        int rate = 1;
        int dxBg = 0;
        int dyBg = 0;
        int dxSprite = 0;
        int dySprite = 0;

        if(!getWorld().getObjects(Sprite.class).isEmpty()) {
            Actor getSprite = (Actor) getWorld().getObjects(Sprite.class).get(0);
            int spriteX = getSprite.getX();
            int spriteY = getSprite.getY();
            this.spriteX = spriteX;
            this.spriteY = spriteY;
        }
        if(Greenfoot.isKeyDown("W")) {
            
            if(getY() > 990){
                if(sprite != null) {
                    dySprite = -5;
                    if(spriteY == 210) {dySprite = 0;}
                    sprite.setLocation(sprite.getX(), sprite.getY() + dySprite);
                    dyBg = 0;
                }
            } else {dyBg-=5;}
            //dyBg-=5;
        }    
        if(Greenfoot.isKeyDown("S")) {
            if(getY() > 990){
                if(sprite != null) {
                    dySprite = 5;
                    sprite.setLocation(sprite.getX(), sprite.getY() + dySprite);
                    dyBg = 0;
                    //dxBg+=5;
                    if(sprite.getY() > 360) {
                        sprite.setLocation(sprite.getX(), 360);
                        dyBg+=5;
                    }   
                }
            } else {dyBg+=5;}
            //dyBg+=5;
        }
        if(Greenfoot.isKeyDown("A")) {
            if(getX() < -710){
                if(sprite != null) {
                    dxSprite = -5;
                    sprite.setLocation(sprite.getX() + dxSprite, sprite.getY());
                    dxBg = 0;
                    //dxBg+=5;
                    if(sprite.getX() < 640) {
                        sprite.setLocation(640, sprite.getY());
                        dxBg-=5;
                    }   
                }
            } else {dxBg-=5;}
        }
        if(Greenfoot.isKeyDown("D")) {
            if(getX() < -710){
                if(sprite != null) {
                    dxSprite = 5;
                    if(spriteX == 1050){dxSprite = 0;}
                    sprite.setLocation(sprite.getX() + dxSprite, sprite.getY());
                    dxBg = 0;
                }
            } else {dxBg+=5;}
        }

        //right collision of the map (at the side of the trees).
        if(getX() < -900) {
            /*setLocation(getX() + 20, getY());*/
        } else {
            setLocation(getX() - dxBg, getY() - dyBg);
        }
        
        //bottom collision of the map (at the little pool of water and some trees next to a mountain).
        if(getY() < -140) {
            setLocation(getX(), getY() + 5);
        } else {
            setLocation(getX() - dxBg, getY() - dyBg);
        }
        
        //left collision of the map (tons of trees).
        if(getX() >= 2000) {
            setLocation(getX() - 10, getY());
        }
        
        //mlg shop door location.
        if(MlgInterior.switchADSFASDF == true) {
            setLocation(1280, 80);
            
            MlgInterior.switchADSFASDF = false;
        }
        
        collisionz();

        System.out.println("bg Pos: " + this.getX() + " x " + this.getY());
        System.out.println("sprite Pos: " + spriteX + " x " + spriteY);
        System.out.println("dxBg: " + dxBg);
        System.out.println("dyBg: " + dyBg);
        System.out.println("dxSprite: " + dxSprite);
        System.out.println("dySprite: " + dySprite);
        System.out.println();
    }
    
    private void collisionz() {
        //guy1 collision
        if(getX() < -560 && getX() > -670 && getY() < 30 && getY() > -70) {
            if(Greenfoot.isKeyDown("A")) {
                setLocation(getX() - 10, getY());
            }
            if(Greenfoot.isKeyDown("D")) {
                setLocation(getX() + 10, getY());
            }
            if(Greenfoot.isKeyDown("W")) {
                setLocation(getX(), getY() - 10);
            }
            if(Greenfoot.isKeyDown("S")) {
                setLocation(getX(), getY() + 10);
            }
            //if(Greenfoot.isKeyDown("enter")) {
            //    System.out.println("You Obtained a Key!");
            //}
        }
        //guy1 talk collision
        if(getX() < -540 && getX() > -690 && getY() < 50 && getY() > -90) {
            if(Greenfoot.isKeyDown("enter")) {
                System.out.println("You Obtained a Key!");
                helloSound.play();
            }
        }
        //obamaz house and lab collisions.
        if(getX() < 760 && getX() > -540 && getY() < 770 && getY() > 330){
            if(Greenfoot.isKeyDown("A")) {
                setLocation(getX() - 10, getY());
            }
            if(Greenfoot.isKeyDown("D")) {
                setLocation(getX() + 10, getY());
            }
            if(Greenfoot.isKeyDown("W")) {
                setLocation(getX(), getY() - 10);
            }
            if(Greenfoot.isKeyDown("S")) {
                setLocation(getX(), getY() + 10);
            }
        }
        //Mlg Shop Collision.
        if(getX() < 1670 && getX() > 1130 && getY() < 580 && getY() > 80){
            if(Greenfoot.isKeyDown("A")) {
                setLocation(getX() - 10, getY());
            }
            if(Greenfoot.isKeyDown("D")) {
                setLocation(getX() + 10, getY());
            }
            if(Greenfoot.isKeyDown("W")) {
                setLocation(getX(), getY() - 10);
            }
            if(Greenfoot.isKeyDown("S")) {
                setLocation(getX(), getY() + 10);
            }
        }
        //Mlg Shop Entrance Collision.
        if(getX() < 1310 && getX() > 1250 && getY() == 80){
            if(Greenfoot.isKeyDown("W")) {
                Greenfoot.setWorld(new MlgShopWorld());
            }
        }
        
        //Portal Collision.
        if(getX() < 1990 && getX() > 1660 && getY() < 880 && getY() > 610){
            if(Greenfoot.isKeyDown("A")) {
                setLocation(getX() - 10, getY());
                Greenfoot.setWorld(new OverWorldP2());
            }
            if(Greenfoot.isKeyDown("D")) {
                setLocation(getX() + 10, getY());
                Greenfoot.setWorld(new OverWorldP2());
            }
            if(Greenfoot.isKeyDown("W")) {
                setLocation(getX(), getY() - 10);
                Greenfoot.setWorld(new OverWorldP2());
            }
            if(Greenfoot.isKeyDown("S")) {
                setLocation(getX(), getY() + 10);
                Greenfoot.setWorld(new OverWorldP2());
            }
        }
        
        //left collision of the map (at the opening gate). collision 1
        //if(getX() > 2410 && getX() < 2720 && getY() > 900) {
        //    setLocation(getX() - 10, getY());
        //    setLocation(getX(), getY() - 10);
        //}
    }
}
