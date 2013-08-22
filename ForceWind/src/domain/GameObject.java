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
public abstract class GameObject implements Meshable {
    
    public final String imgPath;
    
    private boolean stackable = false; //Also means stackable on the ground
    private Point position = null;
    
    private BufferedImage mesh = null;
    
    public GameObject() throws IOException{
        GameProps props = new GameProps();
        imgPath = props.getProperty("mesh_path", "/rsc.mesh/");
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
    public void setMesh(String img) throws IOException {
        setMesh(ImageIO.read(this.getClass().getResource(imgPath + img)));
    }
    
    @Override
    public BufferedImage getMesh(){
        return this.mesh;
    }
    
}
