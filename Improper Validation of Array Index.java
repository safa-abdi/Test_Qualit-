public class DatabaseConnection {
    // Mot de passe codé en dur, vulnérable aux attaques
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "P@ssw0rd123";

    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();
        db.connectToDatabase();
    }

    public void connectToDatabase() {
        System.out.println("Connecting to the database with username: " + USERNAME);
        // Connexion avec les identifiants codés en dur
        try {
            // Simuler la connexion à la base de données
            // En vrai, vous auriez une ligne comme :
            // Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", USERNAME, PASSWORD);
            System.out.println("Connected to the database successfully.");
        } catch (Exception e) {
            System.out.println("Failed to connect to the database.");
            e.printStackTrace();
        }
    }
}
