package day19;

public class SumOfAllNumbersWithingTheRange {
    public static void main(String[] args) {

        //get the sum of numbers from 1-10
        // it's interesting 1+2+3+4+5+6+7+8+9+10 how much it is?

        //when we loop from 1-10
        // sum += 1    //1
        // sum += 2    //3
        // sum += 3    //6
        // sum += 4    //10
        // sum += 5    //15
        // sum += 6    //21
        // sum+= 7     //28
        // sum += 8    //36
        //sum += 9     //45
        //sum += 10    //55
              // sum = sum + i that's idea
        int sum = 0;  // before I add any number, I just assign 0 :why zero?
        for (int i = 1; i <= 10; i++) {
          //  System.out.println(i);
            sum += i ;
          //  System.out.println(sum);  // to see each step how much sum
        }
        System.out.println(sum);  // to be able to at the end total sum
    }
}
