package domain;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import utils.GameLoader;
import utils.GameProps;
/**
 *
 * @author Nindustries
 */
public class GameWorld {
    
    private TileList tiles;
    
    public GameWorld() throws IOException, Exception {
        GameProps props = new GameProps();
        
        loadTiles(props.getProperty("tiles_path", "/rsc/Tiles.xml"));
    }
    
    public GameWorld( TileList tiles ) throws IllegalArgumentException {
        if (tiles == null || tiles.isEmpty()){
            throw new IllegalArgumentException("Tiles list can't be empty/NULL.");
        } else {
            this.tiles = tiles;
        }
    }
    
    private void loadTiles( String path ) throws Exception {
        try{
            this.tiles = GameLoader.loadTiles(path);
        } catch (Exception e){
            throw new Exception("Error while loading tiles.\n" + e.toString()); //Give it some meaning
        }
    }
    
    public GameWorld getPortion(int x, int y, int width, int height)throws IndexOutOfBoundsException {
        GameWorld result = null;
        
        int xmax = tiles.getMaxY();
        int ymax = tiles.getMaxY();
        
        if (x < 0 || y < 0 || x+width > xmax || y+height > ymax){
            throw new IndexOutOfBoundsException("WorldPortion out of World Range.");
        } else {
            TileList sublist = new TileList();
            Iterator it = tiles.entrySet().iterator();
            boolean outOfRange = false;
            while (it.hasNext() && !outOfRange) {
                Map.Entry pairs = (Map.Entry)it.next();
                sublist.put(pairs.getKey(), pairs.getValue());
                //System.out.println(pairs.getKey() + " = " + pairs.getValue());
                it.remove(); // avoids a ConcurrentModificationException
            }
        }
        
        return result;
    }
    
    
    
}
