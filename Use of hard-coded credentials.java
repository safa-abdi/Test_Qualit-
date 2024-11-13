public class DatabaseConnection {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "P@ssw0rd123";

    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();
        db.connectToDatabase();
    }

    public void connectToDatabase() {
        System.out.println("Connecting to the database with username: " + USERNAME);
        try {
            System.out.println("Connected to the database successfully.");
        } catch (Exception e) {
            System.out.println("Failed to connect to the database.");
            e.printStackTrace();
        }
    }
}
