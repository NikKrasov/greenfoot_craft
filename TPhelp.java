import greenfoot.*;  

/**
 * Write a description of class TPhelp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TPhelp extends Actor
{
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Help());
        }
    }
}
