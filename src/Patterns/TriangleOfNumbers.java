package Patterns;
import java.util.Scanner;
public class TriangleOfNumbers {
   public static void triangleOfNumbers(int size){
       for(int i = 1; i<=size; i++){
           for(int spaces = 1; spaces<=size-i; spaces++){
               System.out.print(" ");
           }
           for(int numbers = 1,p=i; numbers<=i; numbers++,p++){
               System.out.print(p);
           }
           for( int dec = 1,p=2*i-2; dec<=i-1; dec++,p--){
               System.out.print(p);
           }
           System.out.println();
       }
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of pattern");
        int size = sc.nextInt();
        triangleOfNumbers(size);
    }
}
