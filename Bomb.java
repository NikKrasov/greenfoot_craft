import greenfoot.*;  
import java.util.*;

public class Bomb extends Actor
{
    You y;
    Food f;
    List<You> List = new ArrayList<>(); 
    List<Food>List2 = new ArrayList<>();
    public void act()
    {
        List = getObjectsInRange(50, You.class);
        if(List.size() > 0)
        {
            y = List.get(0);
            List2 = getWorld().getObjects(Food.class);
            getWorld().removeObjects(List2);
            MyWorld.counterFood = 0;
            getWorld().removeObject(this);
            MyWorld.counterBomb--;
        }
    }
}
