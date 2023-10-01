package Patterns;

public class TriangularPatterns {
    public static void triPatt1(int size){
        for(int i = 0; i< size+1; i++){
            for(int j = 0; j<i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    public static void tripatt2(int size){
        int print = 1;
        for(int i =1; i<=size; i++){
            for(int  j = 1; j<=i;j++){
                System.out.print(print + " ");
                print++;
            }
            System.out.println();
        }

    }
    public static void tripatt3(int size){
        for(int i =0; i<=size; i++){

            for (int j = 1,print=i;j<=i;j++){
                System.out.print(print);
                print++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        triPatt1(4);
        tripatt2(4);
        tripatt3(4);


    }
}
