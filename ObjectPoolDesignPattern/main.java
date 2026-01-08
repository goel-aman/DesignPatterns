package ObjectPoolDesignPattern;

public class main {
    public static void main(String[] args) {
        DBResourceManager resourceManager = DBResourceManager.getInstance();

        try {
            DBConnection connection1 = resourceManager.getConnection();
            connection1.connect();

            DBConnection connection2 = resourceManager.getConnection();
            connection2.connect();

            DBConnection connection3 = resourceManager.getConnection();
            connection3.connect();

            resourceManager.removeConnection(connection3);

            DBConnection connection4 = resourceManager.getConnection();
            connection4.connect();

            DBConnection connection5 = resourceManager.getConnection();
            connection5.connect();

            resourceManager.removeConnection(connection2);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }   
    }
}
