package Patterns;
import java.util.Scanner;
public class MirrorImagePattern {
    public static void printMirror(int size){
        for(int i = 1; i<=size; i++){
            for(int j = 1;j<size-i+1;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void mirrorImage(int size){
        for(int i = 1; i <= size; i++){
            for(int spaces = 1; spaces<=size-i; spaces++){
                System.out.print(" ");
            }
            for(int stars = 1; stars<=i; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static  void printTri(int size){
        for(int i = 1; i<= size; i++){
            for(int j = 1; j<=i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the pattern: ");
        int size = sc.nextInt();
        printMirror(size);
        mirrorImage(size);
        printTri(size);
    }
}

