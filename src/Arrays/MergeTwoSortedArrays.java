package Arrays;

public class MergeTwoSortedArrays {
    public static int[] mergeTwoSortedArrays(int arr1[], int arr2[]) {
        int m = arr1.length;
        int n = arr2.length;
        int mergedArray[] = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        return mergedArray;
    }

    public static void printArray(int arr[]) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr1[] = {2, 4, 6, 8};
        int arr2[] = {1, 3, 5, 7};
        int[] merged = mergeTwoSortedArrays(arr1, arr2);
        printArray(merged);
    }
}
