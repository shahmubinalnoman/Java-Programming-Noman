import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter the alphabet you want to check: ");
        char ch = scanner.next().toLowerCase().charAt(0);

        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("The input is a vowel.");
        } else if ((ch >= 'a' && ch <= 'z')) { // Check if the input is a consonant
            System.out.println("The input is a consonant.");
        } else {
            System.out.println("Invalid input. Please enter a single alphabet.");
        }

        scanner.close();
    }
}
