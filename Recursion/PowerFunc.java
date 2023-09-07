package Recursion;

public class PowerFunc {
    public static int power(int x,int n){
        //base
        if(n == 1){
            return x;
        }
        return x * power(x,n-1);
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(power(x,n));
    }
}
