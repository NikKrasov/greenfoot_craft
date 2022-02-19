import greenfoot.*; 
public class Help3 extends World
{
    public Help3()
    {    
        super(800, 500, 1); 
        showText("Для передвижения по карте используйте стрелки на клавиатуре.", 400, 30);
        showText("Возможно движение по диогонали при совмищении клавиш.", 400, 50);
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
