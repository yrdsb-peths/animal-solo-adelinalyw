import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author Adelina
 * @version 
 */
public class TitleScreen extends World
{
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
    }

    /**
     * the main world act loop
     */
    public void act() {
        //start the game if user presses the space
        if (Greenfoot.isKeyDown("space")) {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld (gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,494,106);
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,304,244);

        Label label2 = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label2,320,297);
        Label label3 = new Label("The Elephant", 60);
        addObject(label3,189,115);
        label3.setLocation(238,114);
    }
}

