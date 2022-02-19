import greenfoot.*; 
public class HelpEscape extends Actor
{
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MyWorld());
        } 
    }
}
