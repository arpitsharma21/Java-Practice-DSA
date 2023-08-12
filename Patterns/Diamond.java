package Patterns;

public class Diamond {
    public static void main(String[] args) {
        int n=7;
        //for first half
        for(int i=1;i<=n;i++){
            //for spacing
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for stars , formula used is (2i-1)
            for(int k=1;k<= (2*(i)-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }

        //for second half
        for(int i=n;i>=1;i--){
            //for spacing
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for stars , formula used is (2i-1)
            for(int k=1;k<= (2*(i)-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
