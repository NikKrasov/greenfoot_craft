import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorldL extends World
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
    public MyWorldL()
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
            
        }
        showText(hour+":"+min,50,20);
        
        if(Greenfoot.getRandomNumber(1000)<10000 && counterFood < 10)
        {
            int x = Greenfoot.getRandomNumber(950);
            int y = Greenfoot.getRandomNumber(550);
            addObject(new Food(),x,y);
            counterFood++;
        }
        if(Greenfoot.getRandomNumber(1000)<10000 && counterWood < 10)
        {
            int y2 = Greenfoot.getRandomNumber(550);
            int x2 = Greenfoot.getRandomNumber(950);
            addObject(new Wood(),x2,y2);
            counterWood++;
        }
        if(Greenfoot.getRandomNumber(1000)<10000 && counterBomb < 2)
        {
            int y3 = Greenfoot.getRandomNumber(550);
            int x3 = Greenfoot.getRandomNumber(950);
            addObject(new Bomb(),x3,y3);
            counterBomb++;
        }

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
        TPhelp tPhelp = new TPhelp();
        addObject(tPhelp,970,570);
    }
}
