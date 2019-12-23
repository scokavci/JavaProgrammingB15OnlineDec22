package day07;

public class IncrementAndDecrement {
    public static void main(String[] args) {

        int apple = 10 ;
//        apple = apple + 1; //long way
//        apple += 1;   //shorthand way
          ++apple;      //shortest way
          ++apple;

          System.out.println( "used ++ twice than apple is "+ apple);

        // apple = apple -1;
        // apple -= 1;
        --apple;

        System.out.println("used -- twice than apple is "+ apple);  //11

       // System.out.println(++apple); //12 we just directly adding 1 and print

        System.out.println("use ++ to increment and concatenate : "+      (++apple)  );

    }
}
