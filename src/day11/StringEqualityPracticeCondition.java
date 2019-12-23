package day11;

public class StringEqualityPracticeCondition {
    public static void main(String[] args) {

        // create a variable called  myStr and assign a value
        // check whether myStr value is Java
        // if true------ correct word
        // if false ----- say JAVA
        String myStr = "Java";

        if(myStr.equals("Java")){
            System.out.println("Correct word !!!!");
        }else if(myStr.equals("Cava")){
            System.out.println("Pumpkin!!");
        }else{
            System.out.println("NOT JAVA NOR PUMKIN");
        }

    }
}
