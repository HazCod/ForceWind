package controllers;

import domain.GameWorld;
import gui.GameUI;
import javax.swing.JPanel;

/**
 *
 * @author Nindustries
 */
public class MainRenderer extends Renderer {
    
    public MainRenderer(GameWorld w, GameUI u){
        super(w,u);
    }
    
    @Override
    protected void renderUI(JPanel drawPanel) {
        //TODO: render all interface data according to GameWorld.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected void renderWorld(JPanel drawPanel) {
        //TODO: get the current portion of the world map and render it.
        //GameWorld sub = getWorld().getPortion(
    }

    @Override
    protected void renderEntities(JPanel drawPanel) {
        //TODO: get all entities and render them on the world according to position and stance.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected void renderEffects(JPanel drawPanel) {
        //TODO: get all suitable effects and render.
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    
}
