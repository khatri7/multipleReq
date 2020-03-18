package properties;

import java.io.FileInputStream;
import java.util.Properties;

 


 

public class PropertiesReader {
    private final Properties baseURI = new Properties();
    
    private PropertiesReader()
    {
        try
        {
            FileInputStream configBase = getFileInputstream(System.getProperty("user.dir")+"/src/main/resources/config.properties");
            if(configBase!=null)
            {
            	System.out.println();
                baseURI.load(configBase);
            }
            
        } 
        catch(Exception e)
        {
        }
    }

    public FileInputStream getFileInputstream(String filepath)
    {
        FileInputStream fstream = null;
        try
        {
            fstream = new FileInputStream(filepath);
        } 
        catch(Exception e)
        {
        }
        return fstream;
    }
    
    public static class LazyHolder
    {
        private static final PropertiesReader INSTANCE = new PropertiesReader();
    }
    public static PropertiesReader getInstance()
    {
        return LazyHolder.INSTANCE;
    }

    public String get(String key)
    {
        return baseURI.getProperty(key);
    }
}
