import java.util.Arrays;
import java.util.Objects;

public class Algorithms {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 1, 0, -1, -12};
        mergeSort(array);
        for (int i : array)
            System.out.print(i + " ");
        int t = 112;
        System.out.println(binarySearch(array, t) ? "Value Found" : "Value Not Found");
        System.out.println(fibonacci(12));
        System.out.println(fibonacciNthTerm(6));
        System.out.println(isArmstrong(1634) ? "Number is Armstrong" : "Not Armstrong");
    }

    static boolean isArmstrong(int n) {
        int originalNumber = n;
        int sum = 0;
        int length = String.valueOf(n).length();

        while (n > 0) {
            sum += Math.pow(n % 10, length);
            n /= 10;
        }
        return sum == originalNumber;
    }

    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int fibonacciNthTerm(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current = 1;

        for (int i = 2; i <= n; i++) {
            int next = previous + current;
            previous = current;
            current = next;
        }

        return current;
    }

    static boolean linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == target)
                return true;
        return false;
    }

    static boolean binarySearch(int[] array, int target) {
        int lo = 0;
        int hi = array.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (array[mid] == target)
                return true;
            else if (array[mid] < target) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }
        return false;
    }
    static void swap(int a, int b) {
        int t = a;
        a = b;
        b = t;
    }
    static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j])
                    swap(array[i], array[j]);
            }
        }
    }
    static void mergeSort(int[] array) {
        if (array.length <= 1)
            return;
        int left[] = Arrays.copyOfRange(array, 0, array.length / 2);
        int right[] = Arrays.copyOfRange(array, array.length / 2, array.length);
        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }

    static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j])
                array[k++] = left[i++];
            else
                array[k++] = right[j++];
        }
        while (i < left.length)
            array[k++] = left[i++];
        while (j < right.length)
            array[k++] = right[j++];
    }
}
