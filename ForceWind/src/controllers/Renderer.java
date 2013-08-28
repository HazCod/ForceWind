package controllers;

import javax.swing.JPanel;

/**
 *
 * @author Nindustries
 */
public abstract class Renderer {
    
    protected void render( JPanel drawPanel ){
        renderUI(drawPanel);
        renderWorld(drawPanel);
        renderEntities(drawPanel);
        renderEffects(drawPanel);
    }
    
    public abstract void renderUI(JPanel drawPanel);
    public abstract void renderWorld(JPanel drawPanel);
    public abstract void renderEntities(JPanel drawPanel);
    public abstract void renderEffects(JPanel drawPanel);
    
    
}
