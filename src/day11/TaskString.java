package day11;

public class TaskString {
    public static void main(String[] args) {

        String myStr = "Java";
        System.out.println(myStr.equals("Java"));

        String yourStr = new String("Java");

        System.out.println(" is my string name as your string ? ");
        // how to compare myStr to yourStr for equality
        System.out.println(myStr.equals(yourStr));


    }
}