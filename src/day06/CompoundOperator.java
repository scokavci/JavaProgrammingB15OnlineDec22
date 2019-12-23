package day06;

public class CompoundOperator {
    public static void main(String[] args) {
      //Assignment operator = -----> will save the result of whatever operation on the right side
        // and assign the result to the left side variable

        int studentOnline = 263;
        studentOnline += 5;
        //studentOnline = studentOnline + 5;
        System.out.println("5 people joined the online class " + studentOnline);
        // instead of naming another variable we keep same name
        //not like math...
//        last defined was the last value
        // += , -= ,*= ,/=,%= are called shorthand operator,compound operator
        // it can simplify the operation if you have same variable
        //on both side of the assignment
        // there is no space between += operators
        // studentOnline = studentOnline - 3;
        studentOnline -= 3;
        System.out.println("3 people left the class " + studentOnline);

        studentOnline *= 2;
        //studentOnline = studentOnline * 2;
        System.out.println("the student count doubled " + studentOnline);

        studentOnline /= 3;
        //studentOnline = studentOnline / 3;
        System.out.println("the student dropped to 1/3: " + studentOnline);
    }
}
