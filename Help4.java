import greenfoot.*; 
public class Help4 extends World
{
    public Help4()
    {    
        super(800, 500, 1); 
        showText("Для того, чтобы подобрать предмет подойдите к нему и нажмите пробел.", 400, 30);
        showText("Количество предметов показано в верхнем левом углу.", 400, 50);
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
