/*

    Write a program to perform the following operation on a circular queue. (Implement the queue using array)
        a) Insert an element
        b) Remove an element

*/

#include <stdio.h>

#define MAX_QUEUE_SIZE 5

struct CircularQueue {
    int arr[MAX_QUEUE_SIZE];
    int front, rear;
};

void initQueue(struct CircularQueue* q) {
    q->front = -1;
    q->rear = -1;
}

int isFull(struct CircularQueue* q) {
    return (q->front == 0 && q->rear == MAX_QUEUE_SIZE - 1) || (q->front == q->rear + 1);
}

int isEmpty(struct CircularQueue* q) {
    return q->front == -1;
}

void insert(struct CircularQueue* q, int x) {
    if (isFull(q)) {
        printf("Queue Overflow\n");
        return;
    }

    if (q->front == -1)
        q->front = 0;

    q->rear = (q->rear + 1) % MAX_QUEUE_SIZE;
    q->arr[q->rear] = x;

    printf("Element %d inserted successfully\n", x);
}

int removeElement(struct CircularQueue* q) {
    if (isEmpty(q)) {
        printf("Queue Underflow\n");
        return -1;
    }

    int removedElement = q->arr[q->front];

    if (q->front == q->rear)
        q->front = q->rear = -1;
    else
        q->front = (q->front + 1) % MAX_QUEUE_SIZE;

    printf("Element %d removed successfully\n", removedElement);

    return removedElement;
}

void display(struct CircularQueue* q) {
    if (isEmpty(q)) {
        printf("Queue is empty\n");
        return;
    }

    printf("Queue: ");
    int i = q->front;
    while (1) {
        printf("%d ", q->arr[i]);
        if (i == q->rear)
            break;
        i = (i + 1) % MAX_QUEUE_SIZE;
    }
    printf("\n");
}

int main(void) {
    struct CircularQueue q;
    initQueue(&q);

    insert(&q, 1);
    insert(&q, 2);
    insert(&q, 3);
    insert(&q, 4);
    insert(&q, 5); // Queue is full now

    display(&q);

    removeElement(&q);
    removeElement(&q);
    removeElement(&q);
    removeElement(&q);
    removeElement(&q); // Queue is empty now

    display(&q);

    return 0;
}
