package Patterns;

public class Butterfly {
    public static void main(String[] args) {
        int n=4;
        //first half
        for(int i=1;i<=4;i++){
//            for printing stars first equal to i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for printing space we have 2*(n-i)
            for(int s=1;s<= 2*(n-i); s++){
                System.out.print(" ");
            }
            //then again print stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //now for 2nd half we have to just create mirror image of 1st half by just changing the outer loop where i=n
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int s=1;s<= 2*(n-i); s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
