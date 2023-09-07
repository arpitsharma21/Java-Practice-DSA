package Recursion;

public class PrintIncreasingOrder {
    public static void printRecursionInc(int n){
        //base case
        if(n == 1){
            System.out.print(n+" ");
            return;
        }

        printRecursionInc(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        int n = 10;
        printRecursionInc(n);
    }
}
