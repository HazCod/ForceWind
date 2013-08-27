package domain;

import java.io.IOException;

/**
 *
 * @author Nindustries
 */
public class Item extends GameObject {
    
    private String name = null;
    private int quantity = 1;
    
    public Item() throws IOException{
        
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
}
