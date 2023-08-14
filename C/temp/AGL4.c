#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define MAX_SIZE 1001

struct Queue {
    int array[MAX_SIZE];
    int front; int back;
};

void initQueue(struct Queue* queue) {
    queue->back = queue->front = -1;
}

bool isEmpty(struct Queue* queue) {
    return queue->front == -1 || queue->front > queue->back;
}

bool isFull(struct Queue* queue) {
    return queue->back == MAX_SIZE - 1;
}

void enqueue(struct Queue* queue, int value) {
    if (isFull(queue)) {
        return;
    }
    queue->array[++queue->back] = value;

    if (queue->front == -1) queue->front++;
    return;
}

void dequeue(struct Queue* queue) {
    if (isEmpty(queue)) {
        return;
    }

    queue->front++;
}

void display(struct Queue* queue) {
    int idx = queue->front;
    do {
        printf("%d ", queue->array[idx]);
        idx = (idx + 1) % MAX_SIZE;
    }
        while (idx != (queue->back + 1) % MAX_SIZE);
}

int main(void) {
    struct Queue queue;
    initQueue(&queue);
    int A[] = {1, 2, 3, 4 , 5, 6, 7, 8, 9 , 0};
    for (int i = 0; i < 10; enqueue(&queue, A[i]), i++);
    display(&queue);
}