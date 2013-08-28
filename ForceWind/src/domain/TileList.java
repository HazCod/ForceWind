package domain;

import java.util.TreeMap;

/**
 *
 * @author Nindustries
 */
public class TileList extends TreeMap {
    
    private int maxX = 0;
    private int maxY = 0;
    
    public TileList(){
        super();
    }
    
    public void put(Coordinate c, Tile t){
        super.put(c, t);
        if (c.x > maxX){
            maxX = c.x;
        }
        if (c.y > maxY){
            maxY = c.y;
        }
    }
    
    public Tile get(Coordinate c){
        return this.get(c);
    }
    
    public int getMaxX(){
        return this.maxX;
    }
    
    public int getMaxY(){
        return this.maxY;
    }
    
}
