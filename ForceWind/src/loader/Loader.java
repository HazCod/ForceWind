package loader;

import domain.GameWorld;
import gui.LoadingScreen;
import javax.swing.JOptionPane;

/**
 *
 * @author Nindustries
 */
public class Loader {
    
    public static void main( String[] args ){
        LoadingScreen loading = new LoadingScreen();
        loading.setVisible(true);
        try {
            //- Start loading
            //load world
            GameWorld world = new GameWorld();
            //- End loading
        } catch (Exception ex) {
            showErrorMsg("Error while loading!\n" + ex.toString());
        }
    }
    
    public static void showErrorMsg(String error){
        JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
}
