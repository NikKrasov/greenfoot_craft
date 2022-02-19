import greenfoot.*;  
import java.util.*;

public class You extends Actor
{   
    Food f;
    Wood w;
    static int counter = 0;
    static int counter2 = 0;
    private static final int offsetX = 2;
    private static final int offsetY = 2;

   
    private boolean isResourceAround(List objs)
    {
        return (objs.size() > 0) && (Greenfoot.isKeyDown("space"));
    }

    private void resourceFound(List<AbstractResource> resources)
    {
        for (AbstractResource resource : resources)
        {
            resource.found();
        }
    }


    private void navigatePage()
    {
        var world = (AbstractPageableWorld)this.getWorld();
        var worldHeight = world.getHeight();
        var worldWidth = world.getWidth();
        if( getX()>(worldWidth - offsetX) ) {
            world.movePageRight();
            setLocation(offsetX, getY());
        }
        
        if(getX()<offsetX){
            world.movePageLeft();
            setLocation(worldWidth - offsetX, getY());
        }

        if(getY()<offsetY){
            world.movePageDown();
            setLocation(getX(), worldHeight - offsetY);
        }

        if(getY()>(worldHeight-offsetY)){
            world.movePageUp();
            setLocation(getX(), offsetY);
        }
        
    }
    
    private void navigate()
    {
        if(Greenfoot.isKeyDown("right")) {
            setLocation(getX()+offsetX, getY());
        }
        if(Greenfoot.isKeyDown("left")) {
            setLocation(getX()-offsetX, getY());
        }
        if(Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY()+offsetY);
        } else if(Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY()-offsetY);
        }
        navigatePage();        
    }
    
    public void act()
    {
        var objsNearBy = getObjectsInRange(50, AbstractResource.class);
        if(isResourceAround(objsNearBy))
        {
            resourceFound(objsNearBy);
        }
        navigate();
    }
}
