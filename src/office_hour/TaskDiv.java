package office_hour;

public class TaskDiv {
    public static void main(String[] args) {
        int num = 10 , num1 = 5;
        int result = 0;
        int sum = num+num1;
        while(sum > num1){
             sum = sum-num1 ;
             result++ ;
        }
        System.out.println(result);
    }
}
