package Patterns;
import java.util.Scanner;
public class SumPattern {
    public static void printSumPattern(int size){
        for( int i = 1; i<=size; i++){
            for( int cols=1,nums =1,sum=0; cols<= i+2; cols++){
                if(cols==i+1){
                    System.out.print("=");

                } else if (cols==i+2) {
                    System.out.print(sum);



                } else if (cols==i) {
                    System.out.print(nums);
                    sum+=nums;

                } else {
                    System.out.print(nums + "+");
                    sum+=nums;
                    nums++;
                }




            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Pattern: ");
        int size = sc.nextInt();
        printSumPattern(size);

    }


}
