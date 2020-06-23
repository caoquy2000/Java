

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define NMAX 1000


void removeDup(char s[], int*length);

int main() {
    int length;
    char s[NMAX];
    printf("\nPlease enter a string:");
    fgets(s, NMAX, stdin);
    length = strlen(s);
    removeDup(s,&length);
    printf("\nPound characters:");
    for(int i = 0; i<= length; i++){
        printf("%5c",s[i]);
    }
    return 0;
}

void removeDup(char s[], int*length){
    for(int i = 0; i <= *length-1;i++){
        for(int j = i+1; j <= *length; j++){
            if(s[i] = s[j]){
                s[i] = s[i+1];
                s[j] = s[j+1];
                *length = *length - 1;
                i = i - 1;
            }
        }
    }
}