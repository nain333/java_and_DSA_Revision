package Arrays;
import java.util.Scanner;
public class findDuplicate {
    public static int[] takeInput(int length){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[length];
        for(int i = 0; i<length; i++){
            System.out.println("Enter the "+i+"th element");
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static int findDuplicate(int arr[]){
        for(int i =0; i< arr.length; i++){
            for(int j=0; (j<arr.length&&j!=i);j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = takeInput(n);
        int duplicate = findDuplicate(arr);
        System.out.println(duplicate);


    }

}
