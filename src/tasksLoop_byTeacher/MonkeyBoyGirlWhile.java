package tasksLoop_byTeacher;

import java.util.Scanner;

public class MonkeyBoyGirlWhile {

    public static void main(String[] args) {

//        There are 3 boy monkeys and 2 girl monkeys
//        the order monkeys fall down is
//        5 - boy - bumped *his* head
//                - No more monkeys jumping on the bed
//​
//        4 - girl - bumped *her* head
//                - No more monkeys jumping on the bed
//​
//        3 - boy - bumped *his* head
//                - No more monkeys jumping on the bed
//​
//        2 - girl - bumped *her* head
//                - No more monkeys jumping on the bed
//​
//        When there is only one monkey the Lyrics change
//        1 little monkey(not monkeys)
//        1 - boy - bumped *his* head
//                - Put those monkeys right to bed
        int monkeyCount = 5;
        while( monkeyCount != 0){
            if( monkeyCount==5 || monkeyCount==3 ) {
                System.out.println(monkeyCount + " boy monkeys jumping on the bed,");
                System.out.println(" 1 fell down and bumped his head,");
                System.out.println(" Mama called the doctor and the doctor said,");
                System.out.println(" No more monkeys jumping on the bed!");
                --monkeyCount;
            }else if(  monkeyCount==4 || monkeyCount==2){
                System.out.println(monkeyCount + " girl monkeys jumping on the bed,");
                System.out.println(" 1 fell down and bumped her head,");
                System.out.println(" Mama called the doctor and the doctor said,");
                System.out.println(" No more monkeys jumping on the bed!");
                --monkeyCount;
            }else if( monkeyCount==1){
                System.out.println(monkeyCount + " boy monkey jumping on the bed,");
                System.out.println(" 1 fell down and bumped his head,");
                System.out.println("Put those monkeys right to bed");
                --monkeyCount;
            }
        }

    }
}