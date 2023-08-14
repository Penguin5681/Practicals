#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node* next;
};

struct Queue {
    struct node* head;
    struct node* tail;
};

struct node* createNode(int data) {
    struct node* newNode = (struct node*)malloc(sizeof(struct node));
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}

struct Queue* createQueue() {
    struct Queue* queue = (struct Queue*)malloc(sizeof(struct Queue));
    queue->head = queue->tail = NULL;
    return queue;
}

void enqueue(struct Queue* queue, int value) {
    struct node* newNode = createNode(value); // Use the createNode function to create a new node
    if (queue->tail == NULL)  
        queue->head = queue->tail = newNode;
    else {
        queue->tail->next = newNode;
        queue->tail = newNode;
    }
}

void dequeue(struct Queue* queue) {
    if (queue->head == NULL) return;

    struct node* toDequeue = queue->head;
    queue->head = queue->head->next;

    if (queue->head == NULL) 
        queue->tail = NULL;
    
    free(toDequeue);
}

void displayQueue(struct Queue* queue) {
    if (queue->head == NULL) {
        printf("Queue is empty.\n");
        return;
    }
    
    struct node* current = queue->head;
    printf("Queue contents: ");
    while (current != NULL) {
        printf("%d ", current->data);
        current = current->next;
    }
    printf("\n");
}

int main(void) {
    struct Queue* queue = createQueue();
    
    int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    for (int i = 0; i < 10; i++)
        enqueue(queue, A[i]); 
    displayQueue(queue);
    
    // Free allocated memory when done
    struct node* current = queue->head;
    while (current != NULL) {
        struct node* temp = current;
        current = current->next;
        free(temp);
    }
    free(queue);
}
