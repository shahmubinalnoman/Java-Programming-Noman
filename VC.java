import java.util.Scanner;

public class VC {
    static char ch;

    public static void main(String[] args) {
        Scanner character = new Scanner(System.in);
        System.out.print("Enter the Alphabet that you want to enter:");
        ch = character.next().toLowerCase().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'e' || ch == 'u') {
            System.out.println("The input is vowel.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("The input is Consonant.");
        } else {
            System.out.println("Invalid input, Plese enter a single alphabet");
        }
        character.close();
    }
}
