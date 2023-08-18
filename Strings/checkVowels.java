package Strings;

public class checkVowels {
    public static void check(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if( ch== 'a' || ch=='e'||ch=='i'||ch=='o' || ch=='u' ){
                count++;
            }
        }
        System.out.println("Total vowels count is: "+count);
    }

    public static void main(String[] args) {
        String str = "arpit sharma";
        check(str);
    }
}
