public class Swap {
    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = 20;

        System.out.println("Before swap,the result is: ");
        System.out.println(a);
        System.out.println(b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap,the result is: ");
        System.out.println(a);
        System.out.println(b);
    }
}