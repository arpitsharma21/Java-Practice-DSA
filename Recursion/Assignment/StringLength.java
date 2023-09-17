package Recursion.Assignment;

/* Write a program to find Length of a String using Recursion */

public class StringLength {
    public static int printLengthString(String str){
        if(0 == str.length()){
            return 0;
        }

       return printLengthString(str.substring(1)) +1;
    }

    public static void main(String[] args) {
        String str = "Arpit Sharma";
        System.out.println(printLengthString(str));
    }
}
