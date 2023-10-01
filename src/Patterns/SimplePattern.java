package Patterns;

public class SimplePattern {
    public static void printSimplePattern(int size){
        for(int i = 0; i < size; i ++){
            for(int j = 0; j < size; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        printSimplePattern(5);

    }
}
