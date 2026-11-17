import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float length, breadth, area, perimeter;

        System.out.print("Enter length: ");
        length = sc.nextFloat();

        System.out.print("Enter breadth: ");
        breadth = sc.nextFloat();

        area = length * breadth;
        perimeter = 2 * (length + breadth);

        System.out.printf("Area = %.2f\n", area);
        System.out.printf("Perimeter = %.2f\n", perimeter);

        sc.close();
    }
}