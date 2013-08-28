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
    private String name = null;
    
    private BufferedImage mesh = null;
    
    public GameObject(Point p, boolean stackable, BufferedImage mesh, String name) throws IOException {
        GameProps props = new GameProps();
        imgPath = props.getProperty("mesh_path", "/rsc.mesh/");
        
        setStackable(stackable);
        setPosition(p);
        setMesh(mesh);
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

    /**
     * @return the stackable
     */
    public boolean isStackable() {
        return stackable;
    }

    /**
     * @param stackable the stackable to set
     */
    private void setStackable(boolean stackable) {
        this.stackable = stackable;
    }

    /**
     * @return the position
     */
    public Point getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Point position) {
        this.position = position;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
