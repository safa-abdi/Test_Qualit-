public class ArrayIndexValidationExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Demande à l'utilisateur d'entrer un indice pour accéder au tableau
        System.out.print("Enter an index to access: ");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        
        // Accès sans validation de l'indice
        System.out.println("Value at index " + index + ": " + numbers[index]);
        
        scanner.close();
    }
}
