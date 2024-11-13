import java.util.Scanner;

public class ArrayIndexExample {
    public static void main(String[] args) {
        int[] scores = {85, 90, 75, 88, 92}; 

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index to access the array: ");
        int userIndex = scanner.nextInt();
        System.out.println("Invalid index! Valid index range: 0 to " + (scores.length - 1));

        
        scanner.close();
    }
}
