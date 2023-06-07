/*
    1. Write a C program to perform following operations on strings. (Use library functions for all
    operations) a) Find length of given string b) Copy string c) Compare given strings d)
    Concatenate given strings.
*/

#include <stdio.h>
#include <string.h>

int main(void) {
    char str[] = "I Love Pizza";

    // a) Length
    int lenSTR = strlen(str);
    printf("%d", lenSTR);

    // b) Copy String
    char strCOPY[] = "";
    strcpy(strCOPY, str);
    printf("\n%s", strCOPY);

    // c) Compare the strings
    if (strcmp(str, strCOPY))
        printf("\nSame String");
    else 
        printf("\nDifferent String");

    // d) Concatenate given strings
    char str1[] = "\nI Love ";
    char str2[] = "Amul Butter";
    strcat(str1, str2);         // does str1 = str1 + str2
    printf("%s", str1);
}