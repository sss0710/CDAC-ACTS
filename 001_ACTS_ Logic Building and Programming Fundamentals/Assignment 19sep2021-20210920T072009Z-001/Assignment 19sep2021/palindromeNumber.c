#include <stdio.h>

// Function declaration OR Function prototype.
unsigned int reverseNumber(unsigned int number); 

int isPalindrome(unsigned int number) {
    unsigned int reverse;

    reverse = reverseNumber(number);

    if (number == reverse)
        return 1;
    return 0;
}

int main() {
    unsigned int reverse;
    unsigned int number;

    printf("Enter a positive integer: ");
    scanf("%u", &number);

    if (isPalindrome(number) == 1)
        printf("Number is palindrome.\n");
    else
        printf("Number is NOT palindrome.\n");

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
