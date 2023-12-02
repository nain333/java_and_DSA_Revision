package Arrays;

public class InsertionSort {
    public static void insertionSort(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;

        }
    }
    public static void printArray(int arr[]){
        System.out.println(  );
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={4,3,6,4,2,1,0,9};
        insertionSort(arr);
        printArray(arr);
    }

}
