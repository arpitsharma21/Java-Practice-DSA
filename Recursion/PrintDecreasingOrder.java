package Recursion;

public class PrintDecreasingOrder {
    public static void printRecursionDec(int n){
        //base case
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printRecursionDec(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        printRecursionDec(n);
    }
}
