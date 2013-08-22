package domain;

import java.io.IOException;
import java.util.ArrayList;
import utils.GameLoader;
import utils.GameProps;

/**
 *
 * @author Nindustries
 */
public class GameWorld {
    
    private ArrayList<ArrayList<Tile>> tiles;
    
    public GameWorld() throws IOException, Exception {
        GameProps props = new GameProps();
        
        loadTiles(props.getProperty("tiles_path", "/rsc/tiles.xml"));
    }
    
    public GameWorld( ArrayList tiles ) throws IllegalArgumentException {
        if (tiles == null || tiles.isEmpty()){
            throw new IllegalArgumentException("Tiles list can't be empty/NULL.");
        } else {
            this.tiles = tiles;
        }
    }
    
    private void loadTiles( String path ) throws Exception {
        this.tiles = GameLoader.loadTiles(path);
    }
    
    public GameWorld getPortion(int x, int y, int width, int height){
        GameWorld result = null;
        
        
        
        return result;
    }
    
    
    
}
