package day26;

public class ArrayTask_NumberTest {

    public static void main(String[] args) {

        // create a variable called finalResult to store
        // create a program to test all element in this int array more than 100 or not
        int[] scores = {156, 101, 76, 187, 87, 110};


        //your result of checking if every number in this array is more than 100 or not
        String finalResult = "";

        //Logic 1:
        // take each item check if it is less than 100, count. At the end if count is more than 0, answer is No.
        int cntLessThan100 = 0;
        for (int eachNum : scores) {
            if (eachNum < 100) {
                System.out.println("eachScore = " + eachNum);
                cntLessThan100++;
            }
        }
        System.out.println("cntLessThan100 = " + cntLessThan100);
        if(cntLessThan100 > 0){
            finalResult = "No";
        }else{
            finalResult = "Yes";
        }
        System.out.println("finalResult = " + finalResult);
    }
}
