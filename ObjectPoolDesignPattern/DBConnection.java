package ObjectPoolDesignPattern;

public class DBConnection {

    public DBConnection() {
        System.out.println("DBConnection created...");
    }

    public void connect() {
        System.out.println("Connecting to database...");
    }
}
