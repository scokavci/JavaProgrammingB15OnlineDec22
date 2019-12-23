package day21;

public class BreakContinue {

    public static void main(String[] args) {

        for (int x = 0; x <=5 ; x++) {
            System.out.println(x);
            // this is "pointless "
            //after 5th iteration
            //the loop will stop by itself
            //no point doing this
            if(x==5){
                break;
            }
            // this is "pointless"
            //because after each iteration
            // its going to next iteration anyway with or without continue
            continue;

        }
    }
}
