package Recursion;

public class BinaryStrings {
    public static void printBinaryStrings(int n,int lastPlace,String str){
                            //base case
        if(n==0){
            System.out.println(str);
            return;
        }

                            //kaam
//        if(lastPlace == 0){
//            //sit 0 on the nth pos
//            printBinaryStrings(n-1,0,str.append("0"));
//            printBinaryStrings(n-1,1,str.append("1"));
//        }
//        else{
//            printBinaryStrings(n-1,0,str.append("0"));
//        }

        //we have done this because  str+0 will be add to the next string not to the current string as in the StringBuilder
        // it will add it in the curr str
        printBinaryStrings(n-1,0,str+"0");
        if(lastPlace == 0){
            printBinaryStrings(n-1,1,str+"1");
        }

    }

    public static void main(String[] args) {
        printBinaryStrings(3,0,"");
    }
}
