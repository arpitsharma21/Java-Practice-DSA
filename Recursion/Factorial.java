package Recursion;

public class Factorial {
    public static int calcFactorial(int n){
        if(n == 0){
            return 1;
        }
        int f = calcFactorial(n-1);
         return n * f;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(calcFactorial(n));
    }
}
