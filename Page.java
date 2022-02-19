import greenfoot.*;  
import java.util.*;

/**
 * Write a description of class Page here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Page implements IActorObservable
{
    private List<PageableActor> food;
    private List<PageableActor> wood;
    private List<PageableActor> bombs;

    /**
     * Constructor for objects of class Page
     */
    private Page()
    {
         food = new ArrayList<PageableActor>();
         wood = new ArrayList<PageableActor>();
         bombs = new ArrayList<PageableActor>();
    }
    
    public static Page createPage()
    {
        var page = new Page();
        while (page.spawn(new Food(page), page.food) < 10);
        while (page.spawn(new Wood(page), page.wood) < 10);
        while (page.spawn(new Bomb(page), page.bombs) < 2);
        return page;
    }
    
    private int spawn(Actor obj, List<PageableActor> actors)
    {
        int y = Greenfoot.getRandomNumber(550);
        int x = Greenfoot.getRandomNumber(950);
        actors.add(new PageableActor(obj, x, y));
        return actors.size();
    }
    
    
    public List<PageableActor> getActors() {
        var result = new ArrayList<PageableActor>(food);
        result.addAll(wood);
        result.addAll(bombs);
        return result;
    }
    
    public void onActorFound(Actor actor) {
        var pActor = food.stream().filter((pa) -> pa.getActor().equals(actor)).findFirst();
        if ( pActor.isPresent() ) { food.remove(pActor.get()); }        
        pActor = wood.stream().filter((pa) -> pa.getActor().equals(actor)).findFirst();
        if ( pActor.isPresent() ) { wood.remove(pActor.get()); }        
        pActor = bombs.stream().filter((pa) -> pa.getActor().equals(actor)).findFirst();
        if ( pActor.isPresent() ) { bombs.remove(pActor.get()); }        
    }

}
