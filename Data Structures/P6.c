/*
    Write a program to perform the following operation on a simple queue. (Implement the queue using array)
        a) Insert an element
        b) Remove an element
*/

// Created on 19 July 2023

#include <stdio.h>
#include <stdbool.h>

#define MAX_QUEUE_SIZE 1001
typedef struct {
    int data[MAX_QUEUE_SIZE];
    int front;
    int back;
} queue;

void initialize_queue(queue *q) {
    q->front = q->back = -1;
}

bool is_full(queue *q) {
    return q->back == MAX_QUEUE_SIZE - 1;
}

bool is_empty(queue *q) {
    return (q->front == -1 || q->front > q->back);
}

void enqueue(queue *q, int val) {
    if (is_full(q))
        return;

    q->data[++q->back] = val;
    if (q->front == -1)
        q->front++;
}

void dequeue(queue *q) {
    if (is_empty(q))
        return;
    q->front++;
}

int peek(queue *q) {
    return q->data[q->front];
}

void display_queue(queue *q) {
    while (!is_empty(q)) {
        printf("%d ", peek(q));
        dequeue(q);
    }
}

int main() {
    queue q;
    initialize_queue(&q);
    for (int i = 1; i <= 10; enqueue(&q, i++));
    display_queue(&q);
}
