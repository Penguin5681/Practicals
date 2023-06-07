/*
    3. Write a program to perform the following operations on a stack. Implement the stack using
    array. a) PUSH b) POP c) PEEK d) CHANGE
*/

public class P3 {
    private int[] arr;
    private int top;
    private int stackSize;

    public P3(int stackSize) {
        this.stackSize = stackSize;
        this.arr = new int[stackSize];
        this.top = -1;
    }

    public void push(int value) {
        if (top == stackSize - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = value;
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Already Empty");
            return;
        }
        top--;
    }

    public int peek() {
        return arr[top];
    }

    public static void main(String[] args) {
        P3 St = new P3(50);
        St.push(1);
        St.push(2);
        St.push(3);
        St.push(4);
        St.pop();
        St.pop();
        System.out.println(St.peek());
    }
}