/*
    Write a program to perform the following operation on a simple queue. (Implement the queue using array)
        a) Insert an element
        b) Remove an element
*/

// Created on 19 July 2023

#include <stdio.h>
#include <stdbool.h>

#define MAX_QUEUE_SIZE 20

struct Queue {
    int arr[MAX_QUEUE_SIZE];
    int front, back;
};

void initQueue(struct Queue* q) {
    q->front = -1;
    q->back = -1;
}

void push(struct Queue* q, int x) {
    if (q->back == MAX_QUEUE_SIZE - 1) {
        printf("Queue Overflow\n");
        return;
    }
    q->back++;
    q->arr[q->back] = x;

    if (q->front == -1) {
        q->front++;
    }
}

void pop(struct Queue* q) {
    if (q->front == -1 || q->front > q->back) {
        printf("Queue Empty\n");
        return;
    }
    q->front++;
}
