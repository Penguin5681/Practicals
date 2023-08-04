/*
    Write program perform the following operations on a singly linked list.
        a) Create Linked list
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

struct Node {
    int data;
    struct Node* next;
};

struct LinkedList {
    struct Node* head;
};

// Function to create an empty linked list
struct LinkedList* createLinkedList() {
    struct LinkedList* newList = (struct LinkedList*)malloc(sizeof(struct LinkedList));
    newList->head = NULL;
    return newList;
}

// Function to insert an element at the first position
void insertAtFirst(struct LinkedList* list, int value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = value;
    newNode->next = list->head;
    list->head = newNode;
}

// Function to insert an element at the last position
void insertAtLast(struct LinkedList* list, int value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = value;
    newNode->next = NULL;

    if (list->head == NULL) {
        list->head = newNode;
        return;
    }

    struct Node* current = list->head;
    while (current->next != NULL) {
        current = current->next;
    }
    current->next = newNode;
}

// Function to insert an element in sorted order
void insertInSortedOrder(struct LinkedList* list, int value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = value;

    if (list->head == NULL || value < list->head->data) {
        newNode->next = list->head;
        list->head = newNode;
        return;
    }

    struct Node* current = list->head;
    while (current->next != NULL && current->next->data < value) {
        current = current->next;
    }
    newNode->next = current->next;
    current->next = newNode;
}

// Function to delete an element from the linked list
void deleteElement(struct LinkedList* list, int value) {
    if (list->head == NULL) {
        printf("List is empty\n");
        return;
    }

    struct Node* current = list->head;
    struct Node* prev = NULL;

    while (current != NULL && current->data != value) {
        prev = current;
        current = current->next;
    }

    if (current == NULL) {
        printf("Element not found in the list\n");
        return;
    }

    if (prev == NULL) {
        list->head = current->next;
    } else {
        prev->next = current->next;
    }

    free(current);
}

// Function to copy a linked list
struct LinkedList* copyLinkedList(struct LinkedList* originalList) {
    struct LinkedList* newList = createLinkedList();
    struct Node* current = originalList->head;

    while (current != NULL) {
        insertAtLast(newList, current->data);
        current = current->next;
    }

    return newList;
}

// Function to find the sum of elements in the linked list
int sumLinkedList(struct LinkedList* list) {
    int sum = 0;
    struct Node* current = list->head;

    while (current != NULL) {
        sum += current->data;
        current = current->next;
    }

    return sum;
}

// Function to count the number of nodes in the linked list
int countNodes(struct LinkedList* list) {
    int count = 0;
    struct Node* current = list->head;

    while (current != NULL) {
        count++;
        current = current->next;
    }

    return count;
}

// Function to search for a given element in the linked list
int searchElement(struct LinkedList* list, int value) {
    struct Node* current = list->head;
    int index = 0;

    while (current != NULL) {
        if (current->data == value) {
            return index;
        }
        current = current->next;
        index++;
    }

    return -1;
}

// Function to display the linked list
void display(struct LinkedList* list) {
    struct Node* current = list->head;

    while (current != NULL) {
        printf("%d ", current->data);
        current = current->next;
    }
    printf("\n");
}

// Function to free the memory occupied by the linked list
void freeLinkedList(struct LinkedList* list) {
    struct Node* current = list->head;
    struct Node* temp;

    while (current != NULL) {
        temp = current;
        current = current->next;
        free(temp);
    }

    free(list);
}

int main(void) {
    struct LinkedList* list = createLinkedList();
    insertAtFirst(list, 3);
    insertAtFirst(list, 1);
    insertAtLast(list, 5);
    insertAtFirst(list, 2);
    insertInSortedOrder(list, 4);

    printf("Linked List: ");
    display(list);

    printf("Sum of elements: %d\n", sumLinkedList(list));
    printf("Number of nodes: %d\n", countNodes(list));

    int elementToSearch = 2;
    int index = searchElement(list, elementToSearch);
    if (index != -1) {
        printf("%d found at index %d\n", elementToSearch, index);
    } else {
        printf("%d not found in the list\n", elementToSearch);
    }

    deleteElement(list, 3);
    deleteElement(list, 6);

    printf("Linked List after deletion: ");
    display(list);

    struct LinkedList* copiedList = copyLinkedList(list);
    printf("Copied Linked List: ");
    display(copiedList);

    freeLinkedList(list);
    freeLinkedList(copiedList);

    return 0;
}
