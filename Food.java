import greenfoot.*;  

public class Food extends AbstractResource
{
    static int counter = 0;
    
    public Food(IActorObservable observable)
    { 
        super(observable);
    }
    
    public void resourceFound(){
        Food.counter++;
        getWorld().showText("Food:" + Food.counter,50,70);
        MyWorld.counterFood--;
    }
}
