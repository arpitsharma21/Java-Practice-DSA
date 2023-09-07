package Recursion;

public class RemoveDuplicatesString {
    public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[]){
        //base case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar = str.charAt(idx);
        //to check char in array we use typeconversion
        if(map[currChar - 'a'] == true){
            //means duplicate so no need to add char in newStr
            removeDuplicates(str,idx+1,newStr,map);
        }
        else{
            //no duplicates
            //for calculating position
            map[currChar - 'a'] = true;
            removeDuplicates(str,idx+1,newStr.append(currChar),map);
        }

    }

    public static void main(String[] args) {
        String str = "apnacollege";

        removeDuplicates(str,0,new StringBuilder(""),new boolean[25] );
    }
}
