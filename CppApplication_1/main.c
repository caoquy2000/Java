

#include <stdio.h>
#include <stdlib.h>
#define NMAX 100


int findMin(int n, double*array[]);
int findPosition(int k);

int main(int argc, char** argv) {
    float number;
    char buffer;
    int flag;
    float n;
    do{
        flag = 0;
        printf("\nInput size of array:");
        scanf("%f", &number);
        scanf("%c", &buffer);
        if(number == 0){
            printf("Array is null, Input again!");
            flag = 1;
        }else if((scanf("%f", &number))==1 || buffer != 10){
            printf("Error!");
            flag = 1;
        }else if((scanf("%f", &number))==0){
            n = number;
            flag = 0;
            break;
        }
    }
    while(flag);
    printf("%f", n);
    return 0;
}



