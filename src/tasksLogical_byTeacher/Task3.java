package tasksLogical_byTeacher;

public class Task3 {
    public static void main(String[] args) {

//        Task 3 :
//        given 3 whole numbers variable num1, num2 , num3 with value already set .
//        Write a program to
//        find out the largest number and print the result

        int num1 = 40 , num2 = 30, num3 = 75 ;

        if(num1 > num2 && num1 > num3) {
            System.out.println("largestNumber is: " + num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.println("largestNumber is: " + num2);
        }else{
            System.out.println("largestNumber is: " + num3);
        }

    }
}
