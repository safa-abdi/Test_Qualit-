import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your message:");
        String userInput = scanner.nextLine();
        System.out.println(String.format("User message: " + userInput));
        scanner.close();
    }
}
