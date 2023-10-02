package Patterns;
import java.util.Scanner;
public class StarPattern {

    public static void printStarPattern(int size){
        for(int i=1; i<=size; i++){
            for(int spaces = 1; spaces<=size-i; spaces++ ){
                System.out.print(" ");
            }
            for(int stars = 1; stars<=i; stars++){
                System.out.print("*");

            }
            for(int decStars=1; decStars<=i-1; decStars++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the size of the Star Pattern: ");
        int size = sc.nextInt();
        printStarPattern(size);
    }
}
