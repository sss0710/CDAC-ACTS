#include <stdio.h>

// Function declaration OR Function prototype.
unsigned int reverseNumber(unsigned int number); 
int countDigits(unsigned int number);

int main() {
    unsigned int reverse;
    unsigned int number;
    int digitCount;

    printf("Enter a positive integer: ");
    scanf("%u", &number);

    digitCount = countDigits(number);
    reverse = reverseNumber(number);

    while (reverse > 0) {
        int digit;

        digit = reverse % 10;

        if (digit == 0) printf("Zero ");
        else if (digit == 1) printf("One ");
        else if (digit == 2) printf("Two ");
        else if (digit == 3) printf("Three ");
        else if (digit == 4) printf("Four ");
        else if (digit == 5) printf("Five ");
        else if (digit == 6) printf("Six ");
        else if (digit == 7) printf("Seven ");
        else if (digit == 8) printf("Eight ");
        else printf("Nine ");

        reverse = reverse / 10;

        digitCount = digitCount - 1;
    }

    while (digitCount != 0) {
        printf("Zero ");
        digitCount = digitCount - 1;
    }

    printf("\n");

    return 0;
}

unsigned int reverseNumber(unsigned int number) {
    unsigned int reverse = 0;

    while (number != 0) {
        int digit;

        digit = number % 10;
        reverse = reverse * 10;
        reverse = reverse + digit;
        number = number / 10;
    }

    return reverse;
}

int countDigits(unsigned int number) {
    int count = 1;
    while (number >= 10) {
        number = number / 10;
        count = count + 1;
    }

    return count;
}
