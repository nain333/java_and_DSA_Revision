package Patterns;
import java.util.Scanner;
public class IsoscelesTriangle {
    public static void printIsosceles(int size){
        for(int i =1; i<=size; i++){
            for(int spaces = 1; spaces<=size-i; spaces++){
                System.out.print(" ");


            }
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            for(int decj = i-1;decj>=1;decj--){
                System.out.print(decj);

            }
            System.out.println();

        }

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the isosceles triangle");
        int size = sc.nextInt();
        printIsosceles(size);

    }

}
