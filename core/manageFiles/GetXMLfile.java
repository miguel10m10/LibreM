package LibreM.core.manageFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by miguel on 9/1/18.
 */
public class GetXMLfile {

    public static String getConfProperties(String propertyConf) throws IOException {

        String property = null;
        java.util.Properties prop = new Properties();

        prop.loadFromXML(new FileInputStream(System.getProperty("user.dir")+"/LibreM/conf/config-properties.xml"));
        property = prop.getProperty(propertyConf);

        return property;
    }

}
