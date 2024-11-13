import java.util.Scanner;

public class ArrayIndexSecurityExample {

    public static void main(String[] args) {
        int[] sensitiveData = {42, 56, 99, 123, 888};  

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index to access the sensitive data: ");
        int userIndex = scanner.nextInt();  

        System.out.println("Sensitive Data at index " + userIndex + ": " + sensitiveData[userIndex]);
    }
}
