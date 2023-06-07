/*
    2. perform following programs using array. a) Search element in array. b) Sort given array. c)
    Reverse elements of array. d) Addition of elements of array. e) Find largest element from
    given array. f) Find smallest element from given array.
*/

#include <bits/stdc++.h>

using namespace std;

// a) Search element in array
bool search(int A[], int size, int target) {
    for (int i = 0; i < size; ++i) {
        if (A[i] == target) return true;
    }
    return false;
}

// b) Sort given array
void sort(int A[], int size) {          // Bubble Sort
    for (int i = 0; i < size - 1; i++) {
        for (int j = 0; j < size - i - 1; j++) {
            if (A[j] > A[j + 1]) {
                int temp = A[j];
                A[j] = A[j + 1];
                A[j + 1] = temp;
            }
        }
    }
    for (int i = 0; i < size; i++) {
        cout << A[i] << " ";
    }
        cout << endl;
}

// c) Reverse elements of array
void doReverse(int A[], int size) {
    int start = 0;
    int end = size - 1;
        while (start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;

            start++;
            end--;
        }
    for (int i = 0; i < size; i++) {
        cout << A[i] << " ";
    }
        cout << endl;
}

// d) Addition of elements of array
int addArray(int A[], int size) {
    int sum = 0;
    for (int i = 0; i < size; ++i) {
        sum += A[i];
    }
    return sum;
}

// e) Find largest element from given array
int largest(int A[], int size) {
    int maxELE = A[0];
    for (int i = 0; i < size; ++i) {
        if (A[i] > maxELE)
            maxELE = A[i];
    }
    return maxELE;
}

// f) Find smallest element from given array.
int smallest(int A[], int size) {
    int minELE = A[0];
    for (int i = 0; i < size; ++i) {
        if (A[i] < minELE)
            minELE = A[i];
    }
    return minELE;
}

signed main(void) {
    int A[] = {1, 2, 3, 4, 5};
    for (int i : A) cout << i;
}