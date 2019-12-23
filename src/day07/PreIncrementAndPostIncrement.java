package day07;

public class PreIncrementAndPostIncrement {
    public static void main(String[] args) {

        int apple = 8;
        apple++;  //9
        System.out.println(apple);     //9
        //System.out.println(++apple); // 10

        //apple++ , when ++ comes after the variable
        //its called post increment
//        BUT it will reflect the increased value next time the variable show up!!
        System.out.println(apple++);   // 9
        System.out.println(apple);   //10

        int score = 50;
        System.out.println(++score); //51
        System.out.println(score++);  //51 and ready to be 52 next time it shows up
        System.out.println(score); // 52

        System.out.println(--score); //51
        System.out.println(score--); //51 ready to be 50 next time shows up
        System.out.println(score); //50

    }
}
