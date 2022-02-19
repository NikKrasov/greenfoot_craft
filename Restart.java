import greenfoot.*;  

 
public class Restart extends Actor
{   
    
     
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld (new MyWorld());
            Food.counter = 0;
            Wood.counter = 0;
        }
        
        
    }
}
