package tasksLogical_byTeacher;

public class Task4 {
    public static void main(String[] args) {

//        Task 4 :
//        given 3 whole numbers variable num1, num2 , num3 with value already set .
//        Write a program with below logic
//        it should print true if all the individual numbers are more than 100
//        if not print not all numbers are more than 100

        int num1 = 120 ,num2= 340, num3 = 440 ;
        if(num1 > 100 && num2 > 100 && num3 > 100){
            System.out.println("true");
        }else{
            System.out.println("not all numbers are more than 100");
        }
    }
}
