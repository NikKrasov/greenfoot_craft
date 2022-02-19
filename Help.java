import greenfoot.*;  
public class Help extends World
{
    public Help()
    {        
        super(800, 700, 1);
        showText("Карта", 400, 60);
        showText("Передвижение", 400, 100);
        showText("Предметы", 400, 140);
        showText("Крафт", 400, 180);
        showText("Легенда игры", 400, 20);
        showText("-->", 550, 20);
        showText("-->", 550, 60);
        showText("-->", 550, 100);
        showText("-->", 550, 140);
        showText("-->", 550, 180);
        prepare();
    }
    
    private void prepare()
    {

        HelpButon1 helpButon1 = new HelpButon1();
        addObject(helpButon1,760,20);
        HelpButon2 helpButon2 = new HelpButon2();
        addObject(helpButon2,760,60);
        HelpButon3 helpButon3 = new HelpButon3();
        addObject(helpButon3,760,100);
        HelpButon4 helpButon4 = new HelpButon4();
        addObject(helpButon4,760,140);
        HelpButon5 helpButon5 = new HelpButon5();
        addObject(helpButon5,760,180);
        HelpEscape helpEscape = new HelpEscape();
        addObject(helpEscape,750,650);
    }
    
} 
