package utils;

import domain.Coordinate;
import domain.Tile;
import domain.TileList;
import java.util.List;
import java.util.ListIterator;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Nindustries
 */
public class GameLoader {
    
    public static TileList loadTiles( String file ) throws Exception {
        
        SAXBuilder builder = new SAXBuilder(false);
        Document doc = builder.build(GameLoader.class.getResource(file));
        Element root = doc.getRootElement();
        
        return loadTiles(root);
    }
    
    private static TileList loadTiles( Element root ) throws Exception {
        TileList result = new TileList();
        
        List channels = root.getChildren();       
        ListIterator it2 = channels.listIterator();
        while (it2.hasNext()){
            //- Tile
            Element el = (Element)it2.next();
            
            //- get properties
            int x = el.getAttribute("x").getIntValue();
            int y = el.getAttribute("y").getIntValue();
            boolean w = el.getAttribute("w").getBooleanValue();
            //- tile
            Tile t = new Tile(w);
            //- set properties
            t.setMesh(el.getValue().trim());
            
            System.out.println("added for " + x + "," + y);
            result.put(new Coordinate(x,y), t);
         }
        
        return result;
    }
    
}
