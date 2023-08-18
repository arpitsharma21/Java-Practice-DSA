package Strings;

public class CompressString {
    public static void compress(String str){
        String newStr = "";
        for(int i=0;i<str.length();i++){
            //creating Integer class object beacuse we have to convert it in string using toString() in end
            Integer count = 1;
            //checking current and next elem to be same
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1) ){
                //then increment count and i
                count++;
                i++;
            }
            //adding char in new string
            newStr += str.charAt(i);
            if(count>1){
                //converting obj into String
                newStr += count.toString();
            }
        }
        System.out.println("New String is: "+newStr);
    }

    public static void main(String[] args) {
        String str = "aaabbcccddd";
        compress(str);
    }
}
