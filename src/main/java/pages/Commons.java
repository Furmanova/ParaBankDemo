package pages;

import until.PropertiesLoader;

public class Commons {
    public static final String BASE_URL = PropertiesLoader.loadProperty("url");

    public Commons() {
    }
}
