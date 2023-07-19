/*
    4. Write a program to convert an infix arithmetic expression into postfix notation.

    Example:
    Infix Notation: 5 + 2 * 3 / 2   <operand> <operator> <operand>
    Prefix Notation :  + * 4 5 7 <operator> <operand> <operand> (Polish Notation)
    Postfix Notation : 4 3 1 / - 4 6 / 1 - * <operand> <operand> <operator> (Reverse Polish Notation)
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int isOperator(char ch)
{
    return (ch == '+' || ch == '-' || ch == '*' || ch == '/');
}

int getPrecedence(char ch)
{
    if (ch == '+' || ch == '-')
        return 1;
    else if (ch == '*' || ch == '/')
        return 2;
    else
        return 0;
}

void infixToPostfix(char *infix, char *postfix)
{
    int i, j;
    char stack[100];
    int top = -1;

    for (i = 0, j = 0; infix[i] != '\0'; i++)
    {
        if (!isOperator(infix[i]))
        {
            postfix[j] = infix[i];
            j++;
        }

        else
        {
            while (top >= 0 && getPrecedence(stack[top]) >= getPrecedence(infix[i]))
            {
                postfix[j] = stack[top];
                j++;
                top--;
            }
            top++;
            stack[top] = infix[i];
        }
    }

    while (top >= 0)
    {
        postfix[j] = stack[top];
        j++;
        top--;
    }

    postfix[j] = '\0';
}

int main()
{
    char infix[] = "5+2*3/2";
    char postfix[100];
    infixToPostfix(infix, postfix);
    printf("%s\n", postfix);
}
