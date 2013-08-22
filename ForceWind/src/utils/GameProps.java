package utils;

import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Nindustries
 */
public class GameProps {
    
    public final String propPATH = "/rsc/game.properties";
    
    private Properties propFile;
    
    public GameProps() throws IOException {
        propFile = new Properties();
        propFile.load(GameProps.class.getResourceAsStream(this.propPATH));
    }
    
    public String getProperty( String property, String defaultV ){
        return propFile.getProperty(property, defaultV);
    }
    
    public void setProperty( String key, String propery ){
        propFile.setProperty(key, propery);
    }
    
}
