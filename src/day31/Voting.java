package day31;

public class Voting {
    public static void main(String[] args) {
        // caller the method here
        checkEligibilty(15);
        checkEligibilty(23);
        checkEligibilty(63);

        // you can assign the value through variable as well
        int yourAge = 12;
        checkEligibilty(  yourAge   );

        // System.out.println(age);   == ERROR!!!
        // BECAUSE METHOD PARAMETER CANNOT BE ACCESSED OUTSIDE OF THE METHOD
        // ONLY WORKS AGE VARIABLE INSIDE METHOD BODY
    }
    // this method has one int parameter named age
    // whoever calling this method , need to provide a  number
    // it will set the value of age into that number
    public static void checkEligibilty(  int age ){
        if(age>18){
            System.out.println("You are eligible to vote");
        } else{
            System.out.println("You are not eligible to vote ");
        }
    }
}
