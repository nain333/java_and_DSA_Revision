package Arrays;

import java.util.Scanner;

public class FindUnique {
    public static int[] takeInput(int n){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("Enter element at "+i+"th possition");
            arr[i]=sc.nextInt();
        }
        return arr;



    }
    public static int findUnique(int[] arr){
        //Your code goes here
        int n = arr.length;
        for(int i=0;i<n;i++){
            boolean duplicate=false;

            for(int j =0;  j<n; j++){

                if(arr[i]==arr[j]&&i!=j){
                    duplicate=true;
                    break;
                }

            }
            if(!duplicate){
                return arr[i];
            }

        }
        return Integer.MIN_VALUE;
    }


    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n = sc.nextInt();
        int arr[]= takeInput(n);
        int unique=findUnique(arr);
        if(unique==Integer.MIN_VALUE) System.out.println("No unique Element");
        else
        System.out.println("Unique: "+ unique);

    }
}
