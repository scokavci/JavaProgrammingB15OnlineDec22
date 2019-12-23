package day32;

public class MethodWithReturnIntro {

    public static void main(String[] args) {

        String name =   giveMeMyName();
        System.out.println("name = " + name);

        int myResult = doubleTheNumber(10);
        System.out.println("myResult = " + myResult);
        // I just want to see result. directly can call method because doubleTheNumber(100) turns a value
        System.out.println("result of doubling 100 is "+ doubleTheNumber(100));
        System.out.println(  doubleTheNumber(5)  );
        System.out.println(  doubleTheNumber(15)  );

        // either you store inside variable and print
        int add14To16Result = add2Numbers(14,16);
        System.out.println("add14To16Result = " + add14To16Result);
        // or just print
        System.out.println(  add2Numbers(14,16) + 5); // action return a value add 5
    }
    // create a method called add, accept two int parameters
    // and return the result as int
    public static int add2Numbers( int num1, int num2){
        //int sum = num1+num2;
        // return sum;
        return num1 + num2 ;
    }



    // I want to create a static method giveMeMyName
    // it returns your name as a result
    // it has no parameters
    public static String giveMeMyName(){
        //assume getting my name
        // is multi steps complex operations
        return "Akbar";
    }
    // create a static method that double the value of a number
    // it accept one int parameter and return doubled value of that number
    public static int doubleTheNumber(int num){
        System.out.println("I am going to double the value of  " + num);
        int result = num*2 ;
        // do action and get the result from your method: 
        // whole purpose of writing a method that return a value
        // so we can save the result after after calling the method
        // and use it somewhere else
        return result;
    }
}
