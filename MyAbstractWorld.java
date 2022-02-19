import greenfoot.*; 
/**
 * Write a description of class MyAbstractWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class MyAbstractWorld extends World
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MyAbstractWorld
     */
    public MyAbstractWorld()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Restart buton = new Restart();
        addObject(buton,962,33);
        You you = new You();
        addObject(you,476,237);
        TPcraft tPcraft = new TPcraft();
        addObject(tPcraft,35,41);
        Stone stone = new Stone();
        addObject(stone,50,50);
        TPhelp tPhelp = new TPhelp();
        addObject(tPhelp,970,570);
    }
}
