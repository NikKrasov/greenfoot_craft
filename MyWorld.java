import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class MyWorld extends AbstractPageableWorld
{
    static int hour = 0;
    static int min = 0;
    static int SecCounter = 0;
    static int counterFood = 0;
    static int counterWood = 0;
    static int counterBomb = 0; 
    
    
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        prepare();
    }

    public void act()
    {
                
        SecCounter++;
        min = SecCounter / 3000;
       
        
        if(min == 60)
        {
            SecCounter = 0;
            hour++;
            
        }// время
        showText(hour+":"+min,50,20);
        
    }
    
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Restart buton = new Restart();
        addObject(buton,970,33);
        You you = new You();
        addObject(you,476,237);
        TPcraft tPcraft = new TPcraft();
        addObject(tPcraft,30,33);
        TPhelp tPhelp = new TPhelp();
        addObject(tPhelp,970,570);
        
    }
    
    
}
