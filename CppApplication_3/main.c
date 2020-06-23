
#include <stdio.h>
#include <stdlib.h>
#define NMAX 1000

void convertBin(int n);

int main() {
    float n;
    int array[NMAX];
    int number;
    int flag;
    char k;
    char buffer;
    do {
        do {
            printf("Convert Decimal to Binary program:\n");
            printf("Enter a positive number: ");
            scanf("%f", &n);
            scanf("%c", &buffer);
            fflush(stdin);
            if (buffer != 10 || n < 0) {
                printf("Error, Pls enter a positive number! \n");
            }
            number = 0;
            flag = 0;
            while(1){
                if(number > n){
                    break;
                }
                number = number + 1;
            }
            number = number -1;
            if ((n - number) > 0) {
                printf("No, enter a integer!\n");
                flag = 0;
            } else {
                flag = 1;
            }
        } while ((buffer != 10) || (n < 0) || (flag != 1));
        printf("Bin:");
        convertBin((int) n);
        printf("\n Press any key to do another conversion! \n");
        k = getchar();
    } while (1);
    return 0;
}

void convertBin(int n) {
    int array[NMAX];
    int i = 0;
    if (n == 0) {
        printf("%d", n);
    } else {
        while (n > 0) {
            array[i] = (int) n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            printf("%d", array[j]);
        }
    }
}

