package Patterns;

import java.util.Scanner;

public class CharecterPatterns {
    public static void simpleCharPattern(int size){
        for(int i = 1; i<= size; i++){
            for(int j = 1; j < size; j++){
                System.out.print((char)('A'+i-1)+ " ");
            }
            System.out.println();
        }
    }
    public static void characterPatt2(int size){
        for(int i = 1; i <= size; i++){
            for(int j =1,p=i; j<=size; j++,p++){
                System.out.print((char)('A'+p-1));
            }
            System.out.println();
        }
    }
    public static void interestingCharPatt(int size){
        for(int i = 1; i<=size;i++){
            for(int j = 1,p=size-i+1; j<=i; j++){
                System.out.print((char)('A'+p-1));
                p++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        System.out.println("Enter the size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        simpleCharPattern(size);
        characterPatt2(size);
        interestingCharPatt(size);

    }
}
