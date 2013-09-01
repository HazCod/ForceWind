package controllers;

import domain.GameWorld;
import gui.GameUI;
import javax.swing.JPanel;

/**
 *
 * @author Nindustries
 */
public abstract class Renderer {
    
    private GameWorld world;
    private GameUI ui;
    
    
    public Renderer(GameWorld world, GameUI ui){
        setWorld(world);
        setUI(ui);
    }
    
    public void render( JPanel drawPanel ){
        renderUI(drawPanel);
        renderWorld(drawPanel);
        renderEntities(drawPanel);
        renderEffects(drawPanel);
    }
    
    protected abstract void renderUI(JPanel drawPanel);
    protected abstract void renderWorld(JPanel drawPanel);
    protected abstract void renderEntities(JPanel drawPanel);
    protected abstract void renderEffects(JPanel drawPanel);

    private void setWorld(GameWorld world) throws IllegalArgumentException {
        if (world == null){
            throw new IllegalArgumentException("GameWorld in renderer can't be NULL.");
        } else {
            this.world = world;
        }
    }

    private void setUI(GameUI ui) throws IllegalArgumentException  {
        if (ui == null){
            throw new IllegalArgumentException("GameUI in renderer can't be NULL.");
        } else {
            this.ui = ui;
        }
    }


    public GameWorld getWorld() {
        return world;
    }


    public GameUI getUi() {
        return ui;
    }
    
    
}
