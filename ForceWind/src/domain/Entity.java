package domain;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 *
 * @author Nindustries
 */
public class Entity extends GameObject {
    
    
    public Entity(Point p, BufferedImage mesh, String name) throws IOException {
        super(p, true, mesh, name);
    }
    
}
