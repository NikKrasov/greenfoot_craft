import greenfoot.*;  
public class HelpButon4 extends Actor
{
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Help1());
        }
    }
}
