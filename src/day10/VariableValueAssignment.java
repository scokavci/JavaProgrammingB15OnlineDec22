package day10;

public class VariableValueAssignment {
    public static void main(String[] args) {
        int offerCount = 1;
       // String message; // this line is just declaring a variable
        //String message ="message"; // this line is declaring and assigning value for the first time,
                            // also called initializing
        //message = "something else"; // changing the value | reassigning
        String message = "";

        if(offerCount > 2){
            message = "great job!!!";
        }
        System.out.println(message);
    }
}
