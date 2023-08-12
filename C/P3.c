/*
    3. Write a program to perform the following operations on a stack. Implement the stack using
    array. a) PUSH b) POP c) PEEP d) CHANGE
*/

// // Created on 19 July 2023

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

int getSize(stack* St) {
    return St->top + 1;
}

bool deleteElement(stack* St, int value) {
    int index = -1;
    // Find the index of the element to be deleted
    for (int i = 0; i <= St->top; i++) {
        if (St->arr[i] == value) {
            index = i;
            break;
        }
    }

    if (index == -1) {
        // Element not found in the stack
        return false;
    }

    // Shift elements to the left to delete the element
    for (int i = index; i < St->top; i++) {
        St->arr[i] = St->arr[i + 1];
    }

    St->top--; // Decrement the top to indicate the removal of an element
    return true;
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
