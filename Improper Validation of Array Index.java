import java.util.Scanner;

public class XSSExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your message:");
        String userInput = scanner.nextLine();

        // Affichage sans validation, risque d'injection XSS
        System.out.println("<div>" + userInput + "</div>");
        scanner.close();
    }
}
