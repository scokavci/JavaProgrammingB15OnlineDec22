package day23;

public class ForEachLoopPracticeMax {
    public static void main(String[] args) {

        long[] salaries = {100000L, 200000L, 150000L, 115000L, 60000L};
        // I need to  pick up an item from this array so I can compare with other items
        //since the first one right there , I just decided to pick it up
        // make it temporarily the max value
        long max = salaries[0];
        for(  long salary : salaries){
            if(salary > max){
                max = salary ;
            }
        }
        System.out.println("maxSalary = " + max);

    }
}
