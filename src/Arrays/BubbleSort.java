package Arrays;

public class BubbleSort {
    public static void printArray(int arr[]){
        System.out.println();
        for(int i = 0; i<arr.length;i++ ){
            System.out.print(arr[i]);
        }

    }
    public static void bubbleSort(int arr[]){
//        compare the consicutive elements
        for(int i =0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }

        }
    }
    public static void main(String args[]){
        int arr[]={4,3,0,7,3,2,1};
        System.out.println(arr.length);
        bubbleSort(arr);
        printArray(arr);

    }
}
