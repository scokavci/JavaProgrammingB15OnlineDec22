package day31;

public class MethodPractice2 {
    // write a piece of reusable code to count from 1 to 10
    // give a name count1to10                             : method name
    // no need for object when being called               : static
    //it should be accessible anywhere in your project    : public
    // it does not return any value                       : void (nothing inside parenthesis)

    public static void main(String[] args) {
        count1to10();
        //System.out.println();
        count1to10();
        // OPTIONALLY you can call using className.methodName();
        MethodPractice2.count1to10();
    }

    // DOES NOT MATTER WHERE YOU PUT THE METHOD
    // AS LONG AS ITS INSIDE THE CLASS
    // AND OUTSIDE ANY OF THE MAIN
    public static void count1to10() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
