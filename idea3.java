import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float a, b, c;

        System.out.print("Enter three numbers: ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        if (a == b && b == c) {
            System.out.println("All numbers are equal");
        }
        else if (a >= b && a >= c) {
            System.out.printf("%.2f is largest", a);
        }
        else if (b >= a && b >= c) {
            System.out.printf("%.2f is largest", b);
        }
        else {
            System.out.printf("%.2f is largest", c);
        }

        sc.close();
    }
}