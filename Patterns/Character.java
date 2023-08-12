package Patterns;

public class Character {
    public static void main(String[] args) {
        int n= 10;
        char ch = 'A';
        for(int i=1;i<=n;i++){
            for(int c = 1;c<=i;c++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
