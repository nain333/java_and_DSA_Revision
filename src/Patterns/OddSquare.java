package Patterns;
import java.util.Scanner;
public class OddSquare {
    public static void printOddSquare(int size){
        for( int row = 1; row<= size; row++){
            for( int col = 1,p=(2*row)-1,max=(2*(size)-1); col<=size; col++ ){
                if(p>max){
                    p=1;
                }
                System.out.print(p+" ");
                p+=2;

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    printOddSquare(size);

    }
}
