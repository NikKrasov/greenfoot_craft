import greenfoot.*;  
public class Help5 extends World
{
    public Help5()
    {    
        super(800, 500, 1);
        showText("Для открытия инвертаря с верстаком нажмите на кнопку в верхнем  левом углу.", 400, 30);
        showText("Справочник крафтов", 400, 70);
        showText("-->", 550, 70);
        prepare();
    }

    private void prepare()
    {
        Help1Escape help1Escape = new Help1Escape();
        addObject(help1Escape,750,450);
        TPCrafts tPCrafts = new TPCrafts();
        addObject(tPCrafts,750,70);
    }
}