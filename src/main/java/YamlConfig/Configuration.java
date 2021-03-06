package YamlConfig;

import static java.lang.String.format;

import java.util.Date;
import java.util.List;
import java.util.Map;

public final class Configuration {
    private Date released;
    private String version;
    private Connection connection;
    private List< String > protocols;
    private Map< String, String > users;

    public Date getReleased() {
        return released;
    }

    public String getVersion() {
        return version;
    }

    public void setReleased(Date released) {
        this.released = released;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public List< String > getProtocols() {
        return protocols;
    }

    public void setProtocols(List< String > protocols) {
        this.protocols = protocols;
    }

    public Map< String, String > getUsers() {
        return users;
    }

    public void setUsers(Map< String, String > users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return format("Version: %s\n", version) +
                format("Released: %s\n", released) +
                format("Connecting to database: %s\n", connection) +
                format("Supported protocols: %s\n", protocols) +
                format("Users: %s\n", users);
    }
}
