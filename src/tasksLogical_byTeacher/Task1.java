package tasksLogical_byTeacher;

public class Task1 {
    public static void main(String[] args) {
//    Task 1 :
//    given 3 whole numbers variable num1, num2 , num3 with value already set .
//    If the sum of the numbers are more than 100 print you have won
//    if not print sum of 3 numbers are not more than 100

      int num1 = 3, num2 = 5 , num3 = 65 ;
      int sum = num1+num2+num3;
      if(sum > 100){
          System.out.println("you have won");
      }else {
          System.out.println(sum + ": sum of 3 numbers are not more than 100 ");
      }
    }
}
