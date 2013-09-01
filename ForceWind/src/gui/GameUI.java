package gui;

import javax.swing.JPanel;

/**
 *
 * @author Nindustries
 */
public interface GameUI {
    void init();
    
    void addGamePanel(JPanel panel);
    void render();
    void pause();
    void resume();
    
    //..
}
