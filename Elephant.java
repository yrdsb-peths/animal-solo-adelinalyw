import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * the Elephant, our hero.
 * 
 * @author (Adelina) 
 * @version (11, 19, 2025)
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound ("elephant.mp3");
    GreenfootImage[] idle = new GreenfootImage[8];
    /**
     * constructor
     */
    public Elephant() {
        for (int i=0; i<idle.length; i++) {
            idle[i] = new GreenfootImage ("images/elephant_idle/idle" + i + ".png");
            idle[i].scale (100, 100);
        }
        setImage(idle[0]);
    }
    
    /**
     * animate the elephant
     */
    int imageIndex = 0;
    public void animateElephant() {
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("left") ) {
            move(-1);
        } else if (Greenfoot.isKeyDown("right") ) {
            move(1);
        }
        
        // Remove apple if elephant eats it
        eat();
        
        //animate the elephant
        animateElephant();
    }
    
    /**
     * eat the apple and spawn new apple if an apple is eaten
     */
    
    public void eat() {
        if (isTouching (Apple.class)) {
            removeTouching (Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            elephantSound.play();
        }

    }
}
