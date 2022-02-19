import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
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
        
        if(counterFood < 10)
        {
            int x = Greenfoot.getRandomNumber(950);
            int y = Greenfoot.getRandomNumber(550);
            addObject(new Food(),x,y);
            counterFood++;
        }//спавн еды
        if(counterWood < 10)
        {
            int y2 = Greenfoot.getRandomNumber(550);
            int x2 = Greenfoot.getRandomNumber(950);
            addObject(new Wood(),x2,y2);
            counterWood++;
        }//спавн древесины
        if( counterBomb < 2)
        {
            int y3 = Greenfoot.getRandomNumber(550);
            int x3 = Greenfoot.getRandomNumber(950);
            addObject(new Bomb(),x3,y3);
            counterBomb++;
        }//спавн бомб

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
