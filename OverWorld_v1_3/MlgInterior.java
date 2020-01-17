import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class MlgInterior here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class MlgInterior extends Actor {
        public static boolean switchADSFASDF = false;
        private GreenfootImage mlgInt = getImage();
        private GreenfootSound iLikeMoney = new GreenfootSound("Hello I like Money EA  Anthem.mp3");
        private int spriteX;
        private int spriteY;
        private int frame = 0;
        
        public MlgInterior () {
            mlgInt.scale(mlgInt.getWidth() * 2, mlgInt.getHeight() * 2);
        }
        
        /**
         * Act - do whatever the MlgInterior wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
        public void act() {
            Actor sprite = getOneIntersectingObject(Sprite.class);
            Actor overWorldP1 = getOneIntersectingObject(OverWorldP1.class);
            int x = getX();
            int y = getY();
            int rate = 1;
            int dxBg = 0;
            int dyBg = 0;
            int dxSprite = 0;
            int dySprite = 0;
            
            frame++;
            
            if(!getWorld().getObjects(Sprite.class).isEmpty()) {
                Actor getSprite = (Actor) getWorld().getObjects(Sprite.class).get(0);
                int spriteX = getSprite.getX();
                int spriteY = getSprite.getY();
                this.spriteX = spriteX;
                this.spriteY = spriteY;
            }
            
            if(frame == 1) {
                //move a little bit
                
            }
            
            //KeyEvents with Collision detection on the walls.
            if(Greenfoot.isKeyDown("W")) {
                setLocation(getX(), getY() + 4);
                if(getY() > 1100) {
                    setLocation(getX(), getY() - 4);
                }
                //sprite.setLocation(sprite.getX(), sprite.getY() - 4);
            }
            if(Greenfoot.isKeyDown("S")) {
                setLocation(getX(), getY() - 4);
                if(getY() < -584) {
                    MlgInterior.switchADSFASDF = true;
                    Greenfoot.setWorld(new OverWorldP1());
                    setLocation(getX(), getY() + 4);
                }
                    //sprite.setLocation(spriteX, spriteY + 4);
            }
            if(Greenfoot.isKeyDown("A")) {
                setLocation(getX() + 4, getY());
                if(getX() > 1596) {
                    setLocation(getX() - 4, getY());
                }
                //sprite.setLocation(spriteX - 4, spriteY);
            }
            if(Greenfoot.isKeyDown("D")) {
                setLocation(getX() - 4, getY());
                if(getX() < -312) {
                    setLocation(getX() + 4, getY());
                }
                //sprite.setLocation(spriteX + 4, spriteY);
            }
            
            collision();
            
        } 
        
    private void collision() {
        //table verticle
        if(getX() < 308 && getX() > 124 && getY() < 286 && getY() > -456){
            if(Greenfoot.isKeyDown("A")) {
                setLocation(getX() - 4, getY());
            }
            if(Greenfoot.isKeyDown("D")) {
                setLocation(getX() + 4, getY());
            }
            if(Greenfoot.isKeyDown("W")) {
                setLocation(getX(), getY() - 4);
            }
            if(Greenfoot.isKeyDown("S")) {
                setLocation(getX(), getY() + 4);
            }
        }
        
        //table horizontle
        if(getX() < 308 && getX() > -500 && getY() < 500 && getY() > 260){
            if(Greenfoot.isKeyDown("A")) {
                setLocation(getX() - 4, getY());
            }
            if(Greenfoot.isKeyDown("D")) {
                setLocation(getX() + 4, getY());
            }
            if(Greenfoot.isKeyDown("W")) {
                setLocation(getX(), getY() - 4);
            }
            if(Greenfoot.isKeyDown("S")) {
                setLocation(getX(), getY() + 4);
            }
        }
        
        //EA guy
        if(getX() < 52 && getX() > -136 && getY() < 196 && getY() > 12){
            if(Greenfoot.isKeyDown("A")) {
                setLocation(getX() - 4, getY());
            }
            if(Greenfoot.isKeyDown("D")) {
                setLocation(getX() + 4, getY());
            }
            if(Greenfoot.isKeyDown("W")) {
                setLocation(getX(), getY() - 4);
            }
            if(Greenfoot.isKeyDown("S")) {
                setLocation(getX(), getY() + 4);
            }
        }
        
        //EA guy talk coll
        if(getX() < 56 && getX() > -140 && getY() < 200 && getY() > 8){
            if(Greenfoot.isKeyDown("enter")) {
                System.out.println("I like money money money \"HEHE!!!\"");
                iLikeMoney.play();
            }
        }
        
        System.out.println(getX() + " x " + getY());
    }
}
