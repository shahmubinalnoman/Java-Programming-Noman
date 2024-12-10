import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        float first, second;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number:");
        first = scanner.nextFloat();

        System.out.print("Enter the second number:");
        second = scanner.nextFloat();

        float sum = first * second;

        System.out.println("The total sum is:" + sum);
        scanner.close();
    }
}