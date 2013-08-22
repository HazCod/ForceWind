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
    
    public GameWorld( ArrayList<ArrayList<Tile>> tiles ) throws IllegalArgumentException {
        if (tiles == null || tiles.isEmpty()){
            throw new IllegalArgumentException("Tiles list can't be empty/NULL.");
        } else {
            this.tiles = tiles;
        }
    }
    
    private void loadTiles( String path ) throws Exception {
        this.tiles = GameLoader.loadTiles(path);
    }
    
    public GameWorld getPortion(int x, int y, int width, int height)throws IndexOutOfBoundsException {
        GameWorld result = null;
        ArrayList<ArrayList<Tile>> temp = null;
        
        int xmax = tiles.size();
        int ymax = tiles.get(0).size();
        
        if (x < 0 || y < 0 || x+width > xmax || y+height > ymax){
            throw new IndexOutOfBoundsException("WorldPortion out of index.");
        } else {
            for (int i=0; i < height; i++){
                temp.set(i, (ArrayList)tiles.get(i+x).subList(y, y+height)); //Nasty casting!
            }
        }
        
        return result;
    }
    
    
    
}
