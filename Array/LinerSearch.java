package Array;

import java.util.Scanner;

public class LinerSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        System.out.println("Enter values of marks: ");
        //getting values
        for(int i=0;i<marks.length;i++){
            marks[i] = sc.nextInt();
        }
        System.out.println("Done");
//        int  marks[] = {1,2,3,4};
        //printing values
        for(int i=0;i<marks.length;i++){
            System.out.println("Marks of "+ i + " is "+ marks[i]);
        }
        System.out.println("Now Searching");
        //for Searching
        int search = 4;
        for(int i=0;i< marks.length;i++){
            if(marks[i] == search){
                System.out.println("Number found at index "+ i);
            }
        }
    }
}
