package utils;

import domain.Tile;
import java.awt.Point;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import javax.xml.parsers.ParserConfigurationException;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Nindustries
 */
public class GameLoader {
    
    public static ArrayList<ArrayList<Tile>> loadTiles( String file ) throws ParserConfigurationException, JDOMException, IOException, Exception{
        ArrayList<ArrayList<Tile>> result = null;
        
        SAXBuilder builder = new SAXBuilder(true);
        Document doc = builder.build(file);
        Element root = doc.getRootElement();
        
        return loadTiles(root);
    }
    
    private static ArrayList<ArrayList<Tile>> loadTiles( Element root ) throws Exception {
        ArrayList<ArrayList<Tile>> result = null;
        
        List channels = root.getChildren();
        ListIterator it2 = channels.listIterator();
        while (it2.hasNext()){
            //- Tile
            Element el = (Element)it2.next();
            
            int x = el.getAttribute("x").getIntValue();
            int y = el.getAttribute("y").getIntValue();
            boolean w = el.getAttribute("w").getBooleanValue();
            Tile t = new Tile(new Point(x,y), w);
            
            //- Children
            t.setMesh(el.getChild("Mesh").getValue());
            
            result.get(x).set(y, t);
         }

        return result;
    }
    
}
