#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define NMAX 100

void inputArray(float array[], float n);
void removeDup(float array[], float *size, int pos);
int findElementDup(float array[], float n, int index);

int main() {
    float n;
    int number;
    char buffer;
    int min;
    float array[NMAX];
    int flag;
    do {
        do {
            printf("\nEnter size of array:");
            scanf("%f", &n);
            scanf("%c", &buffer);
            fflush(stdin);
            if ((buffer != 10) || (n < 0)) {
                printf("\n Error!");
            } else if (n == 0) {
                printf("\n Enter a number > 0");
            }
        } while (buffer != 10 || n < 0 || n == 0);
        
        
        number = 0;
        flag = 0;
        while (1) {
            if (number > n) {
                break;
            }
            number += 1;
        }
        number = number - 1;
        if (n - number > 0) {
            printf("Error!\n");
            flag = 0;
        } else {
            flag = 1;
        }
    } while (flag != 1);
    inputArray(array, n);
    for (int i = 0; i <= n - 1; i++) {
        int check;
        while (1) {
            check = findElementDup(array, n, i);
            if (check == -1) {
                break;
            } else {
                removeDup(array, &n, check);
            }
        }
    }
    printf("\nMang sau khi bo trung: ");
    for (int i = 0; i <= n - 1; i++) {
        printf("%f", array[i]);
    }
    return 0;
}

void inputArray(float array[], float n) {
    char check;
    for (int i = 0; i <= n - 1; i++) {
        do {
            printf("\n array[%d]=", i);
            scanf("%f", &array[i]);
            scanf("%c", &check);
            fflush(stdin);
            if (check != 10) {
                printf("Error!");
            }
        } while (check != 10);
    }
}

int findElementDup(float array[], float size, int index) {
    for (int i = index + 1; i <= size - 1; i++) {
        if (array[index] == array[i]) {
            return i;
        }
    }
    return -1; 
}

void removeDup(float array[], float *size, int pos) {
    for (int i = pos; i <= *size - 1; i++) {
        array[i] = array[i+1];
    }
    *size = *size - 1;
}
