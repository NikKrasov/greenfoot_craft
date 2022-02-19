import greenfoot.*; 
public class TPcraft extends Actor
{
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld (new Craft());
        }
    }
}
