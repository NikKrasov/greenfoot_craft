import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AbstractResource here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class AbstractResource extends Actor
{
    private IActorObservable observable;

    public AbstractResource(IActorObservable observable) 
    {
        super();
        this.observable = observable;
    }
    
    protected abstract void resourceFound();
    
    public void found() {
        resourceFound();
        getWorld().removeObject(this);
        observable.onActorFound(this);
    }
}
