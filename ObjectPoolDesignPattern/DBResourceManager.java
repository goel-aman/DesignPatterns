package ObjectPoolDesignPattern;
import java.util.*;

public class DBResourceManager {
    private List<DBConnection> freeConnections;
    private List<DBConnection> inUseConnections;
    private int maxConnections;
    private int currentConnections;

    private static  DBResourceManager instance = null;

    private DBResourceManager(int maxConnections) {
        this.maxConnections = maxConnections;
        this.currentConnections = 0;
        this.freeConnections = new ArrayList<>();
        this.inUseConnections = new ArrayList<>();
    }

    public static DBResourceManager getInstance() {
        if(instance == null) {
            synchronized(DBResourceManager.class) {
                if(instance == null) {
                    instance = new DBResourceManager(30);
                }
            }
        }

        return instance;
    }

    public DBConnection getConnection() throws Exception {
        DBResourceManager resourceManager = getInstance();
        synchronized (this) {
            if(resourceManager.freeConnections.size() > 0) {
                DBConnection connection = resourceManager.freeConnections.remove(0);
                resourceManager.inUseConnections.add(connection);
                return connection;
            } else if (resourceManager.currentConnections < resourceManager.maxConnections) {
                DBConnection newConnection = new DBConnection();
                resourceManager.inUseConnections.add(newConnection);
                resourceManager.currentConnections++;
                return newConnection;
            } else {
                throw new Exception("No available DB Connection");
            }
        }
    } 
    
    public void removeConnection(DBConnection connection) {
        synchronized(this) {
            DBResourceManager resourceManager = getInstance();
            resourceManager.inUseConnections.remove(connection);
            resourceManager.freeConnections.add(connection);
        }
    }
}
