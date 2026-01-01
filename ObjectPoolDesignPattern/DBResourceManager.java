package ObjectPoolDesignPattern;
import java.util.*;

public class DBResourceManager {
    private List<DBConnection> freeConnections;
    private List<DBConnection> inUseConnections;
    private int maxConnections;
    private int currentConnections;

    private static final DBResourceManager instance = new DBResourceManager(20);

    private DBResourceManager(int maxConnections) {
        this.maxConnections = maxConnections;
        this.currentConnections = 0;
        this.freeConnections = new ArrayList<>();
        this.inUseConnections = new ArrayList<>();
    }

    public static DBResourceManager getInstance() {

        return instance;
    }



}
