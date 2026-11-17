#include <stdio.h>

int main() {
    float Tempc, Tempf;

    printf("Enter temperature in Celsius: ");
    scanf("%f", &Tempc);

    Tempf = (Tempc * 9 / 5) + 32;

    printf("Temperature in Fahrenheit: %.2f", Tempf);

    return 0;
}