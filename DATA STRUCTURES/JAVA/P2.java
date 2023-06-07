/*
    2. perform following programs using array. a) Search element in array. b) Sort given array. c)
    Reverse elements of array. d) Addition of elements of array. e) Find largest element from
    given array. f) Find smallest element from given array.
*/

public class P2 {
    
    // a) Search element in array
    public static boolean SearchELE(int A[], int target) {
        for (int i = 0; i < A.length; ++i) {
            if (A[i] == target) return true;
        }
        return false;
    }
    
    // b) Sort given array
    public static void sort(int A[]) {
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < A.length; ++i) {
            System.out.print(A[i] + " ");
        }
    }

    // c) Reverse elements of array
    public static void doReverse(int A[]) {
        int start = 0;
        int end = A.length - 1;
        while (start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;

            start++;
            end--;
        }
        for (int i = 0; i < A.length; ++i) {
            System.out.print(A[i] + " ");
        }
    }

    // d) Addition of elements of array
    public static int addArray(int A[]) {
        int sum = 0;
        for (int i = 0; i < A.length; ++i) {
            sum += A[i];
        }
        return sum;
    }

    // e) Find largest element from given array
    public static int largest(int A[]) {
        int maxELE = A[0];
        for (int i = 0; i < A.length; ++i) {
            if (A[i] > maxELE)
                maxELE = A[i];
        }
        return maxELE;
    }
    
    // e) Find smallest element from given array
    public static int smallest(int A[]) {
        int minELE = A[0];
        for (int i = 0; i < A.length; ++i) {
            if (A[i] > minELE)
                minELE = A[i];
        }
        return minELE;
    }

    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(SearchELE(A, 2));
        sort(A);
        System.out.println();
        doReverse(A);
        System.out.println();
        System.out.println(addArray(A));
    }
}
