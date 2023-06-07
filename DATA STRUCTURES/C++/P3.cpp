/*
    3. Write a program to perform the following operations on a stack. Implement the stack using
    array. a) PUSH b) POP c) PEEK d) CHANGE
*/

#include <bits/stdc++.h>

using namespace std;
const int stackSize = 50;

class stacks {
    int *arr;
    int top;

        public:

        stacks() {
            arr = new int [stackSize];
            top = -1;
        }
    
        void push(int value) {
            if (top == stackSize - 1) {cout << "Stack Overflow"; return;}
            top++;
            arr[top] = value;
        }

        void pop() {
            if (top == -1) {cout << "Stack Empty"; return;}
            top--;
        }

        int peek() {
            if (top == -1) {cout << "Stack Empty"; }
            return arr[top]; 
        }
};

signed main(void) {
    stacks St;
    St.push(1);
    St.push(2);
    St.push(3);
    St.push(4);
    cout << St.peek() << endl;
    St.pop();
    St.pop();
    St.pop();
    cout << St.peek();

}