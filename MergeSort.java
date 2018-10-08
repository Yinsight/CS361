/* CS 361 Programming Languages and Implementation
 * HW 2
 * Author: Yunting Yin
 */

import java.util.Random;

public class MergeSort {

    public static int[] tmp;

    public static void mergeSort(int[] a) {
        if (a == null) {
            throw new IllegalArgumentException("The array to sort must not be null.");
        }

        if (a.length <= 1) {
            return;
        }

        tmp = new int[a.length];

        mergeSort(a, 0, a.length - 1);
    }

    public static void mergeSort(int[] a, int low, int high) {
        if (low < 0 || low >= a.length) {
            throw new IllegalArgumentException("Invalid low position: " + low);
        }

        if (high < 0 || high >= a.length) {
            throw new IllegalArgumentException("Invalid high position: " + high);
        }

        if (low > high) {
            throw new IllegalArgumentException("The low position must be lower than or equal to the high position.");
        }

        if (low == high) {
            return;
        }

        int mid = low + (high - low) / 2;
        mergeSort(a, low, mid);
        mergeSort(a, mid + 1, high);

        merge(a, low, mid, high);
    }

    /**
     * Merges a[low, mid] and a[mid+1, high], suppose the ranges are ordered in ascending order.
     */
    public static void merge(int[] a, int low, int mid, int high) {
        // i is the start position of the first half part of the array,
        // and j is the the start position of the latter half part
        int i = low, j = mid + 1;

        // the total length participating in the merge
        // int len = high - low + 1;

        // copy a[low, high] to tmp[low, high]
        for (int k = low; k <= high; k++) {
            tmp[k] = a[k];
        }

        // start to merge
        for (int k = low; k <= high; k++) {
            // if i is greater than mid, so elements of a[low, mid] have all been visited
            if (i > mid) {
                a[k] = tmp[j++];
                continue;
            }

            // if j is greater than high, so elements of a[mid+1, high] have all been visited
            if (j > high) {
                a[k] = tmp[i++];
                continue;
            }

            if (a[i] < a[j]) {  // a[i] is smaller, so put it in front
                a[k] = a[i++];

            } else { // a[j] is smaller
                a[k] = a[j++];
            }
        }

    }

    /**
     * Determines whether the given array is ordered in ascending order.
     */
    private static boolean isSorted(int[] a) {
        if (a.length <= 1) {
            return true;
        }

        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        boolean allTestsPassed = true;

        // test with null array
        int[] a = null;
        try {
            mergeSort(a);

            allTestsPassed = false;
            System.out.println("Error, it should cause IllegalArgumentException.");
        } catch (IllegalArgumentException e) {
            // expected exception
        }

        // test with empty array
        a = new int[0];
        mergeSort(a);

        // test with an array containing only one element
        a = new int[1];
        a[0] = 123;
        mergeSort(a);
        if (!isSorted(a)) {
            allTestsPassed = false;
            System.out.println("Error, the array should be ordered(1).");
        }

        // test with an array containing 10 element
        Random random = new Random();
        a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt();
        }

        mergeSort(a);
        if (!isSorted(a)) {
            allTestsPassed = false;
            System.out.println("Error, the array should be ordered(2).");
        }

        // test with an array containing 100,000 element
        a = new int[100000];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt();
        }

        mergeSort(a);
        if (!isSorted(a)) {
            allTestsPassed = false;
            System.out.println("Error, the array should be ordered(3).");
        }

        if (allTestsPassed) {
            System.out.println("Congratulations! All the tests passed.");
        } else {
            System.out.println("There are some tests not passed, please check the information above.");
        }
    }
}
