import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] name = new String[5];
        int[][] marks = new int[5][5];
        int[] total = new int[5];
        float[] percentage = new float[5];
        char[] grade = new char[5];

        int i, j, highest = 0;

        for (i = 0; i < 5; i++) {

            total[i] = 0;

            System.out.print("\nEnter student name: ");
            name[i] = sc.nextLine();

            for (j = 0; j < 5; j++) {

                System.out.print("Enter marks of subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();

                total[i] = total[i] + marks[i][j];
            }

            percentage[i] = total[i] / 5.0f;

            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 80)
                grade[i] = 'B';
            else if (percentage[i] >= 70)
                grade[i] = 'C';
            else if (percentage[i] >= 60)
                grade[i] = 'D';
            else
                grade[i] = 'F';

            if (i == 0 || percentage[i] > percentage[highest]) {
                highest = i;
            }

            sc.nextLine();
        }

        System.out.println("\n----- STUDENT RESULTS -----");

        for (i = 0; i < 5; i++) {

            System.out.println("\nName: " + name[i]);
            System.out.println("Total Marks: " + total[i] + "/500");
            System.out.printf("Percentage: %.2f%%\n", percentage[i]);
            System.out.println("Grade: " + grade[i]);
        }

        System.out.println("\nHighest Percentage Student: " + name[highest]);
        System.out.printf("Highest Percentage: %.2f%%\n",
                percentage[highest]);

        sc.close();
    }
}