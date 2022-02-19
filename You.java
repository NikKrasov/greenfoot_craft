import greenfoot.*;  
import java.util.*;

public class You extends Actor
{   Food f;
    Wood w;
    List<Food> List = new ArrayList<>();
    List<Wood> List2 = new ArrayList<>();
    static int counter = 0;
    static int counter2 = 0;
    public void act()
    {
        List = getObjectsInRange(50, Food.class);
        List2 = getObjectsInRange(50, Wood.class);
        if((List.size() > 0) && (Greenfoot.isKeyDown("space"))){
            Food.counter++;
            getWorld().showText("Food:" + Food.counter,50,40);
            getWorld().removeObjects(List);
            MyWorld.counterFood--;
        }
        if((List2.size() > 0) && (Greenfoot.isKeyDown("space"))){
            Wood.counter++;
            getWorld().showText("Wood:" + Wood.counter,50,70);
            getWorld().removeObjects(List2);
            MyWorld.counterWood--;
        }
        if((Greenfoot.isKeyDown("left")) && !(Greenfoot.isKeyDown("down")) && !(Greenfoot.isKeyDown("up"))){
            setLocation(getX()-2, getY());
        }
        if((Greenfoot.isKeyDown("right")) && !(Greenfoot.isKeyDown("down")) && !(Greenfoot.isKeyDown("up"))){
            setLocation(getX()+2, getY());
        }
        if((Greenfoot.isKeyDown("up")) && !(Greenfoot.isKeyDown("left")) && !(Greenfoot.isKeyDown("right"))){
            setLocation(getX(), getY()-2);
        }
        if((Greenfoot.isKeyDown("down")) && !(Greenfoot.isKeyDown("right")) && !(Greenfoot.isKeyDown("left"))){
            setLocation(getX(), getY()+2);
        }
        if((Greenfoot.isKeyDown("left")) && (Greenfoot.isKeyDown("down")) && !(Greenfoot.isKeyDown("up"))){
            setLocation(getX()-2, getY()+2);
        }
        if((Greenfoot.isKeyDown("right")) && (Greenfoot.isKeyDown("down")) && !(Greenfoot.isKeyDown("up"))){
            setLocation(getX()+2, getY()+2);
        }
        if((Greenfoot.isKeyDown("left")) && (Greenfoot.isKeyDown("up")) && !(Greenfoot.isKeyDown("down"))){
            setLocation(getX()-2, getY()-2);
        }
        if((Greenfoot.isKeyDown("right")) && (Greenfoot.isKeyDown("up")) && !(Greenfoot.isKeyDown("down"))){
            setLocation(getX()+2, getY()-2);
        }
        if((getX()>998) && (counter == 0)){
        Greenfoot.setWorld(new MyWorldR());
        counter++;// переход из центра в правый мир
        }
        if((getX()<2) && (counter == 0)){
        Greenfoot.setWorld(new MyWorldL());
        counter--;// переход из центра в левый мир
        }
        if((getX()>998) && (counter == -1)){
        Greenfoot.setWorld(new MyWorld());
        counter++;// переход из левого мира в центр
        }
        if((getX()<2) && (counter == 1)){
        Greenfoot.setWorld(new MyWorld());
        setLocation(1000,300);
        counter--;// переход из правого мира в центр
        }
        if((getY()>598) && (counter2 == 0)){
        Greenfoot.setWorld(new MyWorldUP());
        counter++;// переход из центра в верхний мир
        }if((getY()>598) && (counter == -1)){
        Greenfoot.setWorld(new MyWorld());
        counter++;// переход из нижнего мира в центр
        }
        if((getY()<2) && (counter == 0)){
        Greenfoot.setWorld(new MyWorldDOWN());
        counter--;// переход из центра в нижний  мир
        }
        if((getY()<2) && (counter == 1)){
        Greenfoot.setWorld(new MyWorldR());
        counter--;// переход из верхнего мира в центр
        }
    }
}
