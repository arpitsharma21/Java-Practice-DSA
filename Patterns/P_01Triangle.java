package Patterns;

public class P_01Triangle {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                //Checking if sum of i+j is even then print '1' else print '0'
                if((i+j)% 2 ==0 ){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }
}
