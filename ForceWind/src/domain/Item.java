package domain;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 *
 * @author Nindustries
 */
public class Item extends GameObject {
    
    private int quantity = 1;
    private ItemEffect effect = null;
    
    
    public Item(Point p, BufferedImage mesh, String name) throws IOException {
        super(p, true, mesh, name);
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the effect
     */
    public ItemEffect getEffect() {
        return effect;
    }

    /**
     * @param effect the effect to set
     */
    public void setEffect(ItemEffect effect) {
        this.effect = effect;
    }
}
