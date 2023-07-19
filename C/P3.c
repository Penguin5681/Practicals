/*
    3. Write a program to perform the following operations on a stack. Implement the stack using
    array. a) PUSH b) POP c) PEEP d) CHANGE
*/

#include <stdio.h>
#include <stdbool.h>
#define stackSize 50
typedef struct {
    int arr[stackSize];
    int top;
} stack;

void initST(stack* St) {
    St->top = -1;
}

void push(stack* St, int value) {
    if (St->top == stackSize - 1) {printf("Stack Overflow"); return;}
    St->arr[++St->top] = value;
}

void pop(stack* St) {
    if (St->top == -1) {printf("Stack Underflow"); return;}
    St->arr[St->top--];
}

int peek(stack* St) {
    if (St->top == -1) {printf("Stack Underflow");}
    return St->arr[St->top];
}

int main(void) {
    stack St;
    initST(&St);

    push(&St, 1);
    push(&St, 2);
    push(&St, 3);
    push(&St, 4);

    pop(&St);
    printf("Topmost Element: %d", peek(&St));
}