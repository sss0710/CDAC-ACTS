#include <stdio.h>

int main() {
    unsigned int number;
    int digitsArray[10];
    int elementsCount = 0;
    int currValue;

    printf("Enter a positive integer: ");
    scanf("%u", &number);

    while (number > 0) {
        int digit;

        digit = number % 10;

        // 4. Append digit to digitsArray
        digitsArray[elementsCount] = digit;
        elementsCount = elementsCount + 1;

        number = number / 10;
    }

    currValue = elementsCount - 1;
    while (currValue >= 0) {
        int digit = digitsArray[currValue];

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

        currValue = currValue - 1;
    }

    printf("\n");

    return 0;
}

