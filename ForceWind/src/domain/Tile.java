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
public class Tile implements Meshable {
    private final String imgPath;
    
    private BufferedImage mesh;
    
    private boolean walkable = false;
    
    
    public Tile( boolean walkable ) throws IOException {
        GameProps props = new GameProps();
        imgPath = props.getProperty("mesh_path", "/rsc/");
        
        setWalkable(walkable);
    }
    
    @Override
    public void setMesh(BufferedImage img) throws IllegalArgumentException {
        if (img == null){
            throw new IllegalArgumentException("Mesh image can't be NULL.");
        } else {
            mesh = img; 
        }
    }
    
    @Override
    public void setMesh(String img) throws Exception {
        try {
            setMesh(ImageIO.read(this.getClass().getResource(imgPath + img)));
        } catch (Exception e){
            throw new Exception("Eror while loading Tile Mesh " + imgPath + img + "\n" + e.toString());
        }
    }
    
    protected void setWalkable( boolean w ){
        this.walkable = w;
    }
    
    public boolean getWalkable(){
        return this.walkable;
    }
    
    @Override
    public BufferedImage getMesh(){
        return this.mesh;
    }
    
}
