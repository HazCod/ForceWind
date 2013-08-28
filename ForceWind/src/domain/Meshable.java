package domain;

import java.awt.image.BufferedImage;

/**
 *
 * @author Nindustries
 */
public interface Meshable {

    void setMesh(BufferedImage img) throws IllegalArgumentException;
    void setMesh(String img) throws Exception;
    BufferedImage getMesh();
    
    
}
