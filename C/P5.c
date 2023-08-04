// 5. Write a program to evaluate a postfix expression.

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

#define MAX_SIZE 100

struct Stack {
    int top;
    int arr[MAX_SIZE];
};

void push(struct Stack* st, int value) {
    if (st->top == MAX_SIZE - 1) {
        printf("Stack overflow!\n");
        exit(1);
    }

    st->top++;
    st->arr[st->top] = value;
}

int pop(struct Stack* st) {
    if (st->top == -1) {
        printf("Stack underflow!\n");
        exit(1);
    }

    int value = st->arr[st->top];
    st->top--;
    return value;
}

int PostfixSolve(const char* s) {
    struct Stack st;
    st.top = -1;

    for (int i = 0; i < strlen(s); i++) {
        if (s[i] >= '0' && s[i] <= '9') {
            push(&st, s[i] - '0');
        } else {
            int op2 = pop(&st);
            int op1 = pop(&st);

            switch (s[i]) {
                case '+': push(&st, op1 + op2); break;
                case '-': push(&st, op1 - op2); break;
                case '*': push(&st, op1 * op2); break;
                case '/': push(&st, op1 / op2); break;
                case '^': push(&st, pow(op1, op2)); break;
            }
        }
    }

    return pop(&st);
}

int main() {
    char expression[100] = "23+4*";

    int result = PostfixSolve(expression);
    printf("Result: %d\n", result);

    return 0;
}

// Sample test_case:
/*
    "23+4*"
    "84/6-"
    "52^3+"
    "723*-"
    "62+54+/-"
    "12+34+*"
    "56+73-*"
    "92/81-*"
    "45+83-*"
    "62+54+/-"
*/