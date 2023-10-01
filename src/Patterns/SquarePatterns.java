package Patterns;

public class SquarePatterns {
    public static void printSquarePatt1(int size){
        for( int i =0; i < size; i++ ){
            for(int j = 0; j<size; j++){
               System.out.print(i+1);
            }
            System.out.println();
        }
    }
    public static void printSquarePatt2(int size){
        for(int i =0; i < size; i ++){
            for(int j= 0; j<size; j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
    public static void printSquarePatt3(int size){
        for(int i = 0; i < size; i++){
            for(int j = 0; j<size; j++){
                System.out.print(size-j+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
        printSquarePatt1(4);
        printSquarePatt2(4);
        printSquarePatt3(4);
    }
}
