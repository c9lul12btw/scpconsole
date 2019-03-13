package YamlConfig;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.yaml.snakeyaml.Yaml;

public class YamlConfigRunner {

    public YamlConfigRunner() throws IOException {
        Yaml yaml = new Yaml();
        try ( InputStream in = Files.newInputStream( Paths.get("src\\main\\resources\\config.yml") ) ) {
            Configuration config = yaml.loadAs( in, Configuration.class );
            System.out.println( config.toString() );
        }
    }
}
