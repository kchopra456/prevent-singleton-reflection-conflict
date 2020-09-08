package learn.config;


import lombok.extern.slf4j.Slf4j;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;

class Configuration {
    public int mockSystemVariable;
    public XRules xRules;
}

public class AppConfig {
    private final String APP_CONFIG_RESOURCE = "app.yml";
    private Configuration config;

    AppConfig(){
        load();
    }

    private void load() {
        Yaml yml = new Yaml();
        try {
            InputStream stream = getClass()
                    .getClassLoader().getResourceAsStream(APP_CONFIG_RESOURCE);
            config = yml.loadAs(stream, Configuration.class);
            System.out.println(config.xRules.xRegex);
        }
        catch (Exception e){
            System.out.println("Exception raised:" + e.getMessage());
        }
    }
}
