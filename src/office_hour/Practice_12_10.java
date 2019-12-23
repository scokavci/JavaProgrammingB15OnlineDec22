package office_hour;

import java.util.Arrays;

public class Practice_12_10 {

    public static void main(String[] args) {

        String[] cars ={"bmw"," wv","audi"};
        // array:index   0      1       2
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        for (int carsIndex = 0; carsIndex <= 2 ; carsIndex++) {
            System.out.println("Here is your car "+ cars[carsIndex]);
        }

        //for each loop
        /*
        // instead of writing 40 different kinds of starbucks coffee
        //we can write inside array and for each loop
        // it will print from left to right

         */
       //temporary variable : array name
        // we dont need to give index because for each loop
        // it reads from left to right directly

        for(String carModel :  cars){
            System.out.println("I am done assigning the car "+ carModel);
        }
        /*
         String carModel : cars
         carmodel = "bmw";
         carmodel = "audi" ;
         carmodel = "wv" ;

         */
                //    0  1  2 3  4
        int[] ages = {23,43,5,7,87};
        System.out.println(ages[2]);
        System.out.println( ages[3] - ages[2]);
                   //          (7    -  5 )  = 2
        // you can get basically a number which is not stored in array with using math
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[3]);

        for(int ageOfStudent : ages){
            System.out.println("this student's age is " + ageOfStudent);
        }
        System.out.println(Arrays.toString(ages));
    }
}
