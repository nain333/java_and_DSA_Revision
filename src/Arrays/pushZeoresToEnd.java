package Arrays;

public class pushZeoresToEnd {

        public static void pushZerosAtEnd(int[] arr) {
            int count = 0;
            for(int i = 0; i<arr.length; i++) {
                if (arr[i] != 0) {
                    arr[count++] = arr[i];
                }
            }
            while(count<arr.length){
                arr[count++]=0;
            }
        }
        public static void printArray(int arr[]){
            System.out.println();
            for(int i = 0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }

        }

    public static void main(String args[]){
        int[] arr={1,0,2,0,5,0,1};
        pushZerosAtEnd(arr);
        printArray(arr);
    }

}
