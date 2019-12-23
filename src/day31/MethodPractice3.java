package day31;

public class MethodPractice3 {
    // write a piece of reusable code to count from 1 to 10
    // give a name count1to10                             : method name
    // no need for object when being called               : static
    //it should be accessible anywhere in your project    : public
    // it does not return any value                       : void (nothing inside parenthesis)
    // create a method called countDownFrom20tillOne
    // create a method to print odd numbers from 1-100 : printOddNumbers1to100
    // Create a method to spell your name :  Seda -->> S-e-d-a
    public static void countDownFrom20tillOne() {
        for (int i = 20; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
        public static void printOddNumbers1to100() {
            for (int i = 1; i <= 100; i++) {
                if (i%2 != 0) {
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
        public static void spellYourName(){
           String name = "Seda";
           String nameStored = "";
            for (int i = 0; i <name.length() ; i++) {
                nameStored += name.charAt(i)+ "-";
            }
            name = nameStored.substring(0, nameStored.length()-1);
            System.out.print( name);
        }
    public static void main(String[] args) {
        countDownFrom20tillOne();
        printOddNumbers1to100();
        spellYourName();
    }
}
