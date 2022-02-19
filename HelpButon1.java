
import java.util.*;
import greenfoot.*;
public class HelpButon1 extends Actor
{
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
        Greenfoot.setWorld(new Help1());
        }
    }
}
