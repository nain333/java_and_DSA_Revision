package Arrays;

import java.util.Scanner;

public class SwapAlternate {
    public static int[] takeArrayInput(int size){
        Scanner sc = new Scanner(System.in);
        int array[] = new int[size];
        int i= 0;
        while (i < size ){
            System.out.println("Enter the Element at "+ i+" th possition");
            array[i]= sc.nextInt();
            i++;

        }
        System.out.println("The array is: ");
        for(int j = 0; j<array.length; j++){
            System.out.print(array[j]+" ");
        }
        System.out.println();
        return array;
    }
    public static void swapAlternatives(int[] array){
        int temp;
        for(int i = 0, j=i+1; j< array.length; i+=2,j+=2){
            temp = array[i];
            array[i]=array[j];
            array[j]=temp;
        }
    }
    public static void printArray(int array[]){
        for (int i =0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();
        int array[]= takeArrayInput(size);
        System.out.println("The swapped array is: ");
        swapAlternatives(array);
        printArray(array);


    }
}
