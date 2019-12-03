package Sorting_Techniques;


public class SelectionSort {

    /*
    O(n^2) - Quadratic Time Complexity
    UnStable algorithm as in case of duplicate elements relative positioning might not be preserved.
     */

    static int[] inputArr = {1, 2, 477, -7, -8, 5, 67};

    public static void swap(int[] arr, int x, int y) {
        if (x == y) {
            return;
        }
        int temp = 0;
        temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String args[]) {
        for (int lastUnsortedArrayIndex = inputArr.length - 1; lastUnsortedArrayIndex > 0; lastUnsortedArrayIndex--) {
            //Assuming largest is at index 0
            int largest = 0;
            //We traverse from index 1 over unSortedArraryIndex to find largest number from unSorted Array Partition
            for (int i = 1; i < lastUnsortedArrayIndex; i++) {
                if (inputArr[i] > inputArr[largest]) {
                    largest = i;
                }
            }
            swap(inputArr, lastUnsortedArrayIndex, largest);
        }
        syso();
    }

    public static void syso() {
        for (int a = 0; a < inputArr.length; a++) {
            System.out.println(inputArr[a]);
        }
    }
}
