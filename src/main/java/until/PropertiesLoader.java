package until;

import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {
    private static final String PROP_FILE = "/test.properties";

    private PropertiesLoader() {
    }

    public static String loadProperty(String name) {
        Properties props = new Properties();

        try {
            props.load(PropertiesLoader.class.getResourceAsStream("/test.properties"));
        } catch (IOException var3) {
            var3.printStackTrace();
        }

        String value = "";
        if (name != null) {
            value = props.getProperty(name);
        }

        return value;
    }
}
