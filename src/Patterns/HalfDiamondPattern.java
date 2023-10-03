package Patterns;
import java.util.Scanner;
public class HalfDiamondPattern {
    public static void printHalfDiamond(int size){
        for (int i = 1; i<=size+1; i++){
            for(int stars = 1,print=1,decPrint=i-2; stars<= (2*i-1);stars++){
                if(stars==1|| stars==2*i-1){
                    System.out.print('*');
                }
                if(print<=i-1&&print>0){
                    System.out.print(print);
                    print++;
                }
                else{
                    if(decPrint>0) {
                        System.out.print(decPrint);
                        decPrint--;
                    }

                }


            }
            System.out.println();
        }
//        lowerPart
        for(int i = size+2; i<=(2*size)+1; i++){
            for(int stars =1,print=1,decPrint=(2*size)-i; stars<=2*((2*(size))+1)-(2*i); stars++){
                if(stars==1||stars==2*((2*(size))+1)-(2*i)){
                    System.out.print("*");
                }
                if(print<=((2*(size))+1)-i){
                    System.out.print(print);
                    print++;
                }else {
                    if (decPrint > 0) {
                        System.out.print(decPrint);
                        decPrint--;
                    }
                }



            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the pattern: ");
        int size = sc.nextInt();
        printHalfDiamond(size);

    }

}
