import java.util.*;
import java.util.stream.*;
import greenfoot.*;

/**
 * Write a description of class AbstraatPageableWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class AbstractPageableWorld extends World implements IPageableWorld
{
    private Dictionary<String, Page> pages = new Hashtable<String, Page>();
    private int pageX=0;
    private int pageY=0;

    public AbstractPageableWorld(int width, int height, int cellSize)
    {    
        super(width, height, cellSize);
    }
    
    protected Page createPage(){
        var page = Page.createPage();
        return page;
    }
    
    private Page getPage(int x, int y) 
    {
        var pageKey = getPageKey(x, y);
        return pages.get(pageKey);
    }

    private String getPageKey(int pageX, int pageY) {
        return String.format("%s,%s", pageX, pageY);
    }
    
    private void setActivePage(Page page) 
    {
        List<PageableActor> actors = page.getActors();
        for (var pActor : actors) {
            this.addObject(pActor.getActor(), pActor.getX(), pActor.getY());
        }
    }
    
    private void removePageObjects(Page page)
    {
        var actorsToRemove = page.getActors();
        // .stream().map((pa) -> pa.getActor()).collect(Collectors.toCollection(ArrayList<Actor>::new));
        for (var pa : actorsToRemove) 
        {
            this.removeObject(pa.getActor());
        }
        // this.removeObjects(actorsToRemove);
    }
    
    private void removePageObjects(int pageX, int pageY)
    {
        var page = getPage(pageX, pageY);
        if (page == null) { return; }
        removePageObjects(page);
    }
    
    public void moveToPage(int pageX, int pageY)
    {
        removePageObjects(this.pageX, this.pageY);
        this.pageX = pageX;
        this.pageY = pageY;
        var pageKey = getPageKey(pageX, pageY);
        var page = pages.get(pageKey);
        if (page == null) {
            page = createPage();
            pages.put(pageKey, page);
        }
        setActivePage(page);
        showText("Page #: " + pageKey,50,90);
        this.repaint();
    }
    
    public void movePageRight()
    {
        moveToPage(pageX+1, pageY);
    }
    
    public void movePageLeft()
    {
        moveToPage(pageX-1, pageY);
    }
    
    public void movePageUp()
    {
        moveToPage(pageX, pageY+1);
    }
    
    public void movePageDown()
    {
        moveToPage(pageX, pageY-1);
    }
    
    public void started()
    {
        if (pages.size() == 0) {
            var page = createPage();
            pages.put(getPageKey(pageX, pageY), page);
            setActivePage(page);
        }
        
    }
}
