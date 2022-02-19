import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help1Escape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help1Escape extends Actor
{
    /**
     * Act - do whatever the Help1Escape wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Help());
        }
    }
}
