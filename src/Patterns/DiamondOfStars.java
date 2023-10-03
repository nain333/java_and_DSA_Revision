package Patterns;
import java.util.Scanner;
public class DiamondOfStars {
    public static void printDiamondOfStars(int size) {
        if (size % 2 == 0) {
            System.out.println("Please enter an odd number.");
        } else if(size==1){
                System.out.println("*");
            return;
        }
        else {
//            upper part
            for(int i= 1; i<=size/2+1; i++){
                for(int spaces =1; spaces<=(size/2+1)-i; spaces++){
                    System.out.print(" ");
                }
                for(int stars = 1; stars <=i; stars++){
                    System.out.print("*");
                }
                for(int decStars=1; decStars<=i-1; decStars++){
                    System.out.print("*");
                }
                System.out.println();
            }
//            lower part
            for(int i = (size/2)+2; i<=size; i++){
                for(int spaces = 1; spaces<= i-(size/2+1); spaces++){
                    System.out.print(" ");
                }
                for(int stars = 1; stars<=size-i+1; stars++){
                    System.out.print("*");
                }
//                lower left half:
                for(int decStars = 1; decStars<=size-i; decStars++){
                    System.out.print("*");
                }
                System.out.println();

            }
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (must be an odd number): ");
        int size = scanner.nextInt();
        printDiamondOfStars(size);


    }
}


