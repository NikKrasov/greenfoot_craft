import greenfoot.*;

/**
 * Write a description of class PageableActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PageableActor  
{
    private Actor actor;
    private int x;
    private int y;

    /**
     * Constructor for objects of class PageableActor
     */
    public PageableActor(Actor actor, int x, int y)
    {
        this.actor = actor;
        this.x=x;
        this.y=y;
    }

    public Actor getActor() { return actor; }
    
    public int getX() { return x; }
    
    public int getY() { return y; }
    
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
        if (actor.getWorld()!=null)
        {
            actor.setLocation(x, y);
        }
    }
}
