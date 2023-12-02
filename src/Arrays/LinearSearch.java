package Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static int[] takeInput(int n){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("Enter the element at"+i+"th possition");
            arr[i]=sc.nextInt();
        }
        return arr;

    }
    public static void printArray(int arr[]){
        System.out.println();
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void selectionSort(int arr[]){
        for(int i = 0; i<arr.length-1;i++){
            int min = Integer.MAX_VALUE;
            int mIndex=Integer.MIN_VALUE;
            for(int j = i; j<arr.length; j++){
//                find minimum element
                if(arr[j]<min){
                    min=arr[j];
                    mIndex=j;
                }

                
            }
            int temp=arr[i];
            arr[i]=min;
            arr[mIndex]=temp;

        }
    }
    public static void main(String args[]){
        System.out.println("Hello World");
        int array[]={5,4,1,3,0,2,1};
        selectionSort(array);
        printArray(array);

    }
}
