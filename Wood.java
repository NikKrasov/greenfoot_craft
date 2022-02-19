import greenfoot.*; 

public class Wood extends AbstractResource
{
    static int counter = 0;
    
    public Wood(IActorObservable observable)
    {
        super(observable);
    }
    public void resourceFound(){
        Wood.counter++;
        getWorld().showText("Wood:" + Wood.counter,50,40);
        MyWorld.counterWood--;
    }
}
