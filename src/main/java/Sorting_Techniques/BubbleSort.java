package Sorting_Techniques;

public class BubbleSort {

    /*
    Time Complexity is O(n^2)
     */

    static int[] arr = {21, 32, 3, 4, 5, 6, 7};
    int[] unsortedArr;

    public static void main(String[] args) {
        for (int unsortedArr = arr.length - 1; unsortedArr > 0; unsortedArr--) {
            for (int y = 0; y < unsortedArr; y++) {
                if (arr[y] > arr[y + 1]) {
                    swap(arr, y, y + 1);
                }
            }
        }
        syso();
    }

    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void syso() {
        for (int a = 0; a < arr.length - 1; a++) {
            System.out.println(arr[a]);
        }
    }
}
