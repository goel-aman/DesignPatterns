package ObjectPoolDesignPattern;
import java.util.*;

public class DBResourceManager {
    private List<DBConnection> freeConnections;
    private List<DBConnection> inUseConnections;
    private int maxConnections;
    private int currentConnections;

    private static volatile  DBResourceManager instance = null;

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
                    instance = new DBResourceManager(6);
                }
            }
        }

        return instance;
    }

    public DBConnection getConnection() throws Exception {
        synchronized (this) {
            if(this.freeConnections.size() > 0) {
                System.out.println("Reusing existing DB Connection...");

                DBConnection connection = this.freeConnections.remove(0);
                this.inUseConnections.add(connection);
                return connection;
            } else if (this.currentConnections < this.maxConnections) {
                System.out.println("Creating new DB Connection...");
                DBConnection newConnection = new DBConnection();
                this.inUseConnections.add(newConnection);
                this.currentConnections++;
                return newConnection;
            } else {
                throw new Exception("No available DB Connection");
            }
        }
    } 
    
    public void removeConnection(DBConnection connection) {
        synchronized(this) {
            this.inUseConnections.remove(connection);
            this.freeConnections.add(connection);
        }
    }
}
