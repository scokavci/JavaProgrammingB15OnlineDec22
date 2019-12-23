package tasksLoop_byTeacher;

public class MonkeyBoyGirlFor {
    public static void main(String[] args)  {

        for( int monkeyCount =5 ; monkeyCount != 0 ;monkeyCount--) {
            if( monkeyCount==5 || monkeyCount==3 ) {
                System.out.println(monkeyCount + " boy monkeys jumping on the bed,");
                System.out.println(" 1 fell down and bumped his head,");
                System.out.println(" Mama called the doctor and the doctor said,");
                System.out.println(" No more monkeys jumping on the bed!");
            }else if(  monkeyCount==4 || monkeyCount==2){
                System.out.println(monkeyCount + " girl monkeys jumping on the bed,");
                System.out.println(" 1 fell down and bumped her head,");
                System.out.println(" Mama called the doctor and the doctor said,");
                System.out.println(" No more monkeys jumping on the bed!");
            }else if( monkeyCount==1){
                System.out.println(monkeyCount + " boy monkey jumping on the bed,");
                System.out.println(" 1 fell down and bumped his head,");
                System.out.println("Put those monkeys right to bed");
            }
        }
    }
}
