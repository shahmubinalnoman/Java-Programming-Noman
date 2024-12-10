import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner evenread = new Scanner(System.in);
        System.out.print("Enter the number that you want to enter for check purpose:");
        if (evenread.hasNextInt()) {

            int num = evenread.nextInt();

            if (num % 2 == 0) {
                System.out.println("The number is Even.");
            } else {
                System.out.println("The number is Odd number.");
            }
        } else {
            System.out.println("Please enter an integer number....");
            System.out.println("Because other numbers like float,character are not allowed in this scenerio.");
        }

        evenread.close();
    }
}
