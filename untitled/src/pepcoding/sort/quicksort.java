package pepcoding.sort;

import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int[] arr = {8, 5, 1, 3, 7, 2, 9, 6};
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quicksort(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int pivot = arr[hi];
        int pi = partition(arr, pivot, lo, hi);
        quicksort(arr, lo, pi - 1);
        quicksort(arr, pi + 1, hi);
    }

    public static int partition(int[] arr, int pivot, int lo, int hi) {
        int i = lo, j = lo;
        while (i <= hi) {
            if (arr[i] <= pivot) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                i++;
            }
        }
        System.out.println("pivot-index " + (j - 1));
        return j - 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
