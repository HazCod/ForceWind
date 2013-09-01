package loader;

import domain.GameWorld;
import gui.LoadingScreen;
import gui.MainScreen;
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
            //load GUI
            
            
            createMainScreen();
            //- End loading
            loading.dispose();
        } catch (Exception ex) {
            showErrorMsg("Error while loading!\n" + ex.toString());
        }
    }
    
    public static void createMainScreen(){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e){}
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }
    
    public static void showErrorMsg(String error){
        JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
}
