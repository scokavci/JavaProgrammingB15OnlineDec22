package day16;

public class Loop {
    public static void main(String[] args) {
        // print Hello world 5 times
        // also keep the count of how many times you said hello
        int count = 1;
        System.out.println("Hello World");
        // count = count +1;
        //count += 1;
        ++ count ;
        System.out.println("Hello World");
        ++ count ;
        System.out.println("Hello World");
        ++ count ;
        System.out.println("Hello World");
        ++ count ;
        System.out.println("Hello World");

        System.out.println("Count is: "+ count);
        System.out.println("---------------------------");
        int cnt = 1;
        while(cnt <= 5){
            System.out.println("Hello World");
            System.out.println(" cnt value is "+ cnt);
            ++cnt ;    // increase the value by one
        }
        /* 1st time in the loop:   cnt = 1
           check this 1 <= 5 --->> true
           hello word
           cnt value is 1
           increase the cnt value to 2

           2nd time in the loop:  cnt = 2
           check this 2 <= 5 --->> true
           hello word
           cnt value is 2
           increase the cnt value to 3
           ...................................
            5th time in the loop:  cnt = 5
           check this 5 <= 5 --->> true
           hello word
           cnt value is 6
           increase the cnt value to 6
           6<=5  condition is false.
           GET OUT OF THE LOOP !!!!!!!!!!!!!
        */



    }
}
