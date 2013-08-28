package controllers;

import domain.GameWorld;
import gui.GameUI;

/**
 *
 * @author Nindustries
 */
public class MainController {
    
    private GameWorld world;
    private GameUI ui;
    
    public MainController(GameWorld w, GameUI u){
        setWorld(w);
        setUI(u);
    }

    /**
     * @return the world
     */
    public GameWorld getWorld() {
        return world;
    }

    /**
     * @param world the world to set
     */
    public void setWorld(GameWorld world) {
        this.world = world;
    }

    /**
     * @return the ui
     */
    public GameUI getUI() {
        return ui;
    }

    /**
     * @param ui the ui to set
     */
    public void setUI(GameUI ui) {
        this.ui = ui;
    }
    
}
