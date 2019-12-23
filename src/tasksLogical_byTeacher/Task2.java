package tasksLogical_byTeacher;

public class Task2 {
    public static void main(String[] args) {

//        Task 2 :
//        given 3 whole numbers variable  num1, num2 , num3 with value already set .
//        and another int variable called sumOfSpecialNumber with initial value 0
//        Write a program to print
//        If the sum of the numbers are more than 100 !
//
      int num1 = 60, num2 = 25, num3 = 35;
      int sumOfSpecialNumber = 0;
       sumOfSpecialNumber = num1 +num2+num3;

      if( sumOfSpecialNumber > 100){
          System.out.println("the sum of the numbers are more than 100 !");
      }

    }
}
