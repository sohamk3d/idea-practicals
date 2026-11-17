
#include <stdio.h>

int main() {
    int num1, num2, choice;

    printf("Enter a number: ");
    scanf("%d", &num1);

    printf("Enter second number: ");
    scanf("%d", &num2);

    do {
        printf("\n1. Addition");
        printf("\n2. Subtraction");
        printf("\n3. Multiplication");
        printf("\n4. Division");
        printf("\n5. Exit");

        printf("\n\nEnter your choice: ");
        scanf("%d", &choice);

        switch(choice) {

            case 1:
                printf("Addition = %d", num1 + num2);
                break;

            case 2:
                printf("Subtraction = %d", num1 - num2);
                break;

            case 3:
                printf("Multiplication = %d", num1 * num2);
                break;

            case 4:
                if(num2 != 0)
                    printf("Division = %.2f", (float)num1 / num2);
                else
                    printf("Cannot divide by zero.");
                break;

            case 5:
                printf("Exited the program successfully.");
                break;

            default:
                printf("Entered wrong choice.");
        }

        printf("\n");

    } while(choice != 5);

    return 0;
}
