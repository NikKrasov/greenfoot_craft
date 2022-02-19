import greenfoot.*;  
public class Help1 extends World
{
    public Help1()
    {    
        super(800, 500, 1);
        showText("", 400, 30);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Help1Escape help1Escape = new Help1Escape();
        addObject(help1Escape,750,450);
    }
}