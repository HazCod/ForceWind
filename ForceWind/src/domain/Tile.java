package domain;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import utils.GameProps;

/**
 *
 * @author Nindustries
 */
public class Tile {
    private final String imgPath;
    
    private Point position;
    private BufferedImage mesh;
    
    private boolean walkable = false;
    
    
    public Tile( Point pos, boolean walkable ) throws IOException {
        GameProps props = new GameProps();
        imgPath = props.getProperty("mesh_path", "/rsc.mesh/");
        
        setPosition(pos);
        setWalkable(walkable);
    }
    
    protected void setMesh(BufferedImage img) throws IllegalArgumentException {
        if (img == null){
            throw new IllegalArgumentException("Mesh image can't be NULL.");
        } else {
            mesh = img; 
        }
    }
    
    public void setMesh(String img) throws IOException {
        setMesh(ImageIO.read(this.getClass().getResource(imgPath + img)));
    }
    
    protected void setWalkable( boolean w ){
        this.walkable = w;
    }
    
    protected void setPosition( Point p) throws IllegalArgumentException {
        if (p == null){
            throw new IllegalArgumentException("Point for Tile can't be NULL.");
        } else {
            this.position = p;
        }
    }
    
    public boolean getWalkable(){
        return this.walkable;
    }
    
    public Point getPosition(){
        return this.position;
    }
    
}
