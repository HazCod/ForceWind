package domain;

import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 *
 * @author Nindustries
 */
public interface Meshable {

    void setMesh(BufferedImage img) throws IllegalArgumentException;
    void setMesh(String img) throws IOException;
    BufferedImage getMesh();
    
    
}
