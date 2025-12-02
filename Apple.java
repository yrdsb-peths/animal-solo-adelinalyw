import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * food for our elephant.
 * 
 * @author (Adelina) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    public Apple() {
        setImage("images/apple1.png");
    }
    int speed = 1;
    
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY()+speed);
        
        // Remove apple and draw game over when apple get to the bottom
        MyWorld world = (MyWorld) getWorld();
        if (getY() >= world.getHeight()) {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed (int spd) {
        speed = spd;
    }
}
