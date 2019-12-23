package tasksLogical_byTeacher;

public class Task6 {
    public static void main(String[] args) {


//        Task 6 :
//        given 3 whole numbers variable num1, num2 , num3 with value already set .
//        Write a program with below logic
//        if multiplication result of num1 and num2 greater than sum of all the numbers
//        print excellent result
// else
//        not the numbers combination I am looking for
        int num1 = 5, num2 = 2 , num3 = 7 ;
        int result = num1 * num2 ;
        int sum = num1 + num2 + num3 ;

        if(result > sum){
            System.out.println("Excellent result");
        }else{
            System.out.println(" not the numbers combination I am looking for");
        }
    }
}
