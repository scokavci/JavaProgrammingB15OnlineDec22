package day22;

public class ArrayIntro {

    public static void main(String[] args) {

        // syntax for creating variable to store single item
        // and assigning value
        // dataType variableName = value here
        int num1 = 10;
        System.out.println("num1 = "+num1);  // you access the value
        // syntax for creating variable to store multiple items
        // and assigning values
        // dataType [] variableName = new dataType[ count of item ]
        //count of item = character count = array side
        // this array can hold 4 items; it's also known as array size

        int[] scores = new int[4] ;

        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

        // this is how you access the value and print
        System.out.println(  scores[0]   );
        System.out.println(  scores[1]   );
        System.out.println(  scores[2]   );
        System.out.println(  scores[3]   );

        //updating the value at certain index
        scores[1] = 99;
        System.out.println(  scores[1]);

        //once array is created with certain size , we CANNOT CHANGE THE SIZE!!!

        //when you create new ARRAY Object but if you don't assign a value
        // you get default value
        // it will get default value in each element

        int[]  numbers = new int[3] ;
        System.out.println(  scores[0]   );
        System.out.println(  scores[1]   );
        System.out.println(  scores[2]   );
        System.out.println(  scores[3]   );
    }
}
