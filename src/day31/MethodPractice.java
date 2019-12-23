package day31;

public class MethodPractice {
    public static void main(String[] args) {
        // call directly since we are in same class
      sayhelloWorld7times();
      // alternatively call using class name
        MethodPractice.sayhelloWorld7times();
        //you can call static method of other class
        // using classname.methodname(...)
        MethodIntro.sayHello();
        calculateMathProblem();
    }
    // cannot create 2 methods with same exact method header (puclic state void sayhelloWorld7times= method header)
    // even though it has different things inside
    // create a method to print 7 line of hello and call it sayHelloWorld7Times
    public static void sayhelloWorld7times(){

        // a piece of code that you want to resume goes here
        // 3 print line statement
        System.out.println("Hello world line 1 ");
        System.out.println("Hello world line 2 ");
        System.out.println("Hello world line 3 ");
// 2 print statement
        System.out.print("Hello world line 4 ");
        System.out.print("Hello world line 5 ");
// 2 print line statement
        System.out.println("Hello world line 6 ");
        System.out.println("Hello world line 7 ");

    }
    public static void calculateMathProblem(){
        int num1 = 5;
        double num2 = 3.0d;
        float num3 = 3.0f;
        double result1 = num1 + num2;
        double result2 = num1 - num2;
        double result3 = num1 * num2;
        double result4 = num1 / num2;
        float result5 = num1 / num3;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);




    }


}
