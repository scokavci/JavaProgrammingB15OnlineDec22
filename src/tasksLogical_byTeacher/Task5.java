package tasksLogical_byTeacher;

public class Task5 {

    public static void main(String[] args) {

//        Task 5 :
//        given 3 whole numbers variable num1, num2 , num3 with value already set .
//        Write a program with below logic
//        add 100 to all the numbers less than 20 ;
//        print out the value of each variable to test your code.
        int num1 = 12, num2 = 13, num3 = 16;


        if (num1 < 20) {
            int newNumber1 = num1 + 100;
            System.out.println(newNumber1);
            if (num2 < 20) {
                int newNumber2 = num2 + 100;
                System.out.println(newNumber2);
                if (num3 < 20) {
                    int newNumber3 = num3 + 100;
                    System.out.println(newNumber3);
                }
            }
        }
    }
}
