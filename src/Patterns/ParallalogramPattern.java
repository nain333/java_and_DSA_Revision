package Patterns;
import java.util.Scanner;
public class ParallalogramPattern {
    public static void printParllalogram(int size){
        for(int i = 1; i<=size; i++){
            for( int spaces=1; spaces<=i-1; spaces++){
                System.out.print(" ");
            }
            for(int stars = 1; stars<=size; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the Parllelogram: ");
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        printParllalogram(size);
    }


}
