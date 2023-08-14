/*
    Write program perform the following operations on a singly linked list.
        a) Create Linked list   C
        b) Insert element at first position
        c) Insert element at last position
        d) Insert element in Linked list in sorted order
        e) Delete element from Linked list
        f) Copy Linked list
        g) Find the sum of elements of linked list
        h) Count number of nodes of linked list
        i) Search given element in linked list
*/

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

struct node {
    int data;
    struct node* next;
};

struct linkedList {
    struct node* head;
};

struct linkedList *createList() {
    struct linkedList *newList = (struct linkedList*)malloc(sizeof(struct linkedList));
    newList->head = NULL;
    return newList;
}

void insertAtHead(struct linkedList* list, int value) {
    struct node* newNode = (struct node*)malloc(sizeof(struct node));
    newNode->data = value;
    newNode->next = list->head;
    list->head = newNode;
}

void insertAtTail(struct linkedList* list, int value) {
    struct node* newNode = (struct node*)malloc(sizeof(struct node));
    newNode->data = value;
    newNode->next = NULL;

    if (list->head == NULL) {
        list->head = newNode; return;
    }

    struct node* current_node = list->head;
    while (current_node->next != NULL)
        current_node = current_node->next;
    
    current_node->next = newNode;
}

void deleteElement(struct linkedList *list, int value) {        // Delete By Value
    if (list->head == NULL) return;

    struct node* current_node = list->head;
    struct node* previous_node;

    while (current_node != NULL && current_node->data != value) {
        previous_node = current_node;
        current_node = current_node->next;
    }

    if (current_node == NULL) {
        printf("Value Not Found"); return;
    }

    if (previous_node == NULL) 
        list->head = current_node->next;
    else 
        previous_node->next = current_node->next;
    
    free(current_node);
}

struct linkedList *copyList(struct linkedList* list) {
    struct linkedList *newList = createList();
    struct node* current_node = list->head;
    while (current_node != NULL) {
        insertAtTail(newList, current_node->data);
        current_node = current_node->next;
    }
    return newList;
}

int sumOfLL(struct linkedList* list) {
    int sum = 0;
    struct node* current_node = list->head;
    while (current_node != NULL) {
        sum += current_node->data;
        current_node = current_node->next;
    }
    return sum;
}

int sizeOfLL(struct linkedList *list) {
    int size = 0;
    struct node* current_node = list->head;
    while (current_node != NULL) {
        size++;
        current_node = current_node->next;
    }
    return size;
}

bool search(struct linkedList* list, int target) {
    if (list == NULL) return false;
    struct node* current_node = list->head;
    while (current_node != NULL) {
        if (current_node->data == target) 
            return true;
        current_node = current_node->next;
    } 
    return false;
}

void display(struct linkedList* list) {
    struct node* current_node = list->head;
    while (current_node != NULL) {
        printf("%d -> ", current_node->data);
        current_node = current_node->next;
    }
        printf("NULL\n");
}

int main(void) {
    struct linkedList* list = createList();
    int A[] = {1, 2, 3, 4, 5, 6, 7, 8};
    for (int i = 0; i < 8; insertAtTail(list, A[i]), i++); 

    if (search(list, 5)) {
        printf("TRUE\n");
    }
    else printf("FALSE\n");
    
    printf("Size of Linked List: %d\n", sizeOfLL(list));
    printf("Sum of nodes of Linked List: %d\n", sumOfLL(list));
    deleteElement(list, 5);
    display(list);

    struct linkedList* copiedList = copyList(list);
    display(copiedList);
}