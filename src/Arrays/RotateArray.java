package Arrays;

public class RotateArray {
    public static void reverse(int arr[],int start, int end) {
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }


    }

    public static void rotateArray(int arr[],int d){
        d%=arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);


    }
    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        int d = 8;
        rotateArray(arr,d);
        printArray(arr);
    }
}
