import greenfoot.*;  
public class Help2 extends World
{
    public Help2()
    {    
        super(800, 500, 1);
        showText("Для того, чтобы открыть карту нажмите M.", 400, 30);
        showText("Для того, чтобы закрыть карту нажмите M повторно.", 400, 50);
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
