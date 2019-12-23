package day31;
//WHY DO WE NEED TO HAVE A METHOD
// REUSABLE CODE!!! AVOID CODE DUPLICATED

public class MethodIntro {

    public static void main(String[] args) {

      // TWO WAYS TO CALL STATIC METHODS
        //1st way: ClassName.methodName.(external data if needed)
        // if you are in the same class
        //MethodIntro.sayHello(); // optional if you are in the same class

        //2nd way:you can directly called them
        // methodName(external data if needed)
        System.out.println("Begin");
        sayHello();
        System.out.println("-----------------");
        sayHello();
        System.out.println("THE END");

        // program flow: 12-->>13(21,23,24,25) -> 14->15(21,23,24,25)->16->done
    }// MAIN METHOD ENDS HERE!!!!

    // DO NOT CREATE A METHOD INSIDE MAIN METHOD
    // IT CAN BE ANYWHERE INSIDE THE CLASS OUTSIDE MAIN METHOD
    public static void sayHello(){
        System.out.println("Hello World");
        System.out.println("My Name is Juma");
        System.out.println("I love Java");
    }
}

