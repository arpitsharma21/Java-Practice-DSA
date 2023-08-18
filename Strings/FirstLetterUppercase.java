package Strings;

public class FirstLetterUppercase {
    public static String changeUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        //changing first character into uppercase
        char ch = Character.toUpperCase(str.charAt(0));
        //Adding it to the stringbuilder
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            //check if 1st element is a empty space if yes then append it in sb
            if(str.charAt(i) == ' ' && i<str.length() -1 ){
                sb.append(str.charAt(i));
                i++;
                //after incrementing i now we have the first char of a new word which is to be in  uppercase
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                //if not just add the char in the sb
                sb.append(str.charAt(i));
            }
        }
        //changing stringbuilder object into string
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi i am arpit sharma";
        System.out.println(changeUpperCase(str));
    }
}
