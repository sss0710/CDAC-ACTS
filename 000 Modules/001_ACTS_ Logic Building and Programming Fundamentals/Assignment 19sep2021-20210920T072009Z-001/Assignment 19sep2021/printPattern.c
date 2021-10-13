#include <stdio.h>

void printLeftAlignPattern(int lineCount);
void printRightAlignPattern(int lineCount);
void printNumberTriangle(int lineCount);

int main() {
    int lineCount;

    printf("How many lines of pattern to print: ");
    scanf("%d", &lineCount);

    printRightAlignPattern(lineCount);
    printLeftAlignPattern(lineCount);
    printNumberTriangle(lineCount);

    return 0;
}

void printLeftAlignPattern(int lineCount) {
    int lineNo = 0;

    while (lineNo != lineCount) {
        int starsPrinted;

        lineNo = lineNo + 1;
        starsPrinted = 0;

        while (starsPrinted != lineNo) {
            printf("*");
            starsPrinted = starsPrinted + 1;
        }

        printf("\n");
    }
}

void printRightAlignPattern(int lineCount) {
    int lineNo = 0;

    while (lineNo != lineCount) {
        int spacePrinted;
        int starsPrinted;

        lineNo = lineNo + 1;
        spacePrinted = 0;

        while (spacePrinted != (lineCount - lineNo)) {
            printf(" ");
            spacePrinted = spacePrinted + 1;
        }

        starsPrinted = 0;

        while (starsPrinted != lineNo) {
            printf("*");
            starsPrinted = starsPrinted + 1;
        }

        printf("\n");
    }
}
void printNumberTriangle(int lineCount) {
    int lineNo = 0;

    while (lineNo != lineCount) {
        int spacePrinted;
        int currNo;

        lineNo = lineNo + 1;
        spacePrinted = 0;

        while (spacePrinted != (lineCount - lineNo)) {
            printf(" ");
            spacePrinted = spacePrinted + 1;
        }

        printf("1");

        currNo = 1;
        while (currNo != lineNo) {
            currNo = currNo + 1;
            printf("%d", currNo);
        }

        currNo = lineNo - 1;
        while (currNo > 0) {
            printf("%d", currNo);
            currNo = currNo - 1;
        }

        printf("\n");
    }
}

