package office_hour;

import java.util.Arrays;

public class Practice_12_16 {
    public static void main(String[] args) {
        String[] names = {"John","Kevin","Scott"};
        System.out.println("First name: "+names[0]);

        // if you don't need index and just print inside the array: use foreach
        for(String eachName  : names){
            System.out.println(eachName+" ");
        }
        System.out.println("\n................");
        System.out.println(Arrays.toString(names));
        // let's say we need to store some table
        // where we have rows and columns
        // 2D array of arrays
        // |student id|  |name|  |age| |country|
        String[][] students = {
                {"1", "John", "35","USA"},
                {"2", "Kevin", "40","Brazil"},
                {"3", "Scott", "20","Canada"}
        };
        // how many inner arrays in 2D ARRAY
        System.out.println("How many arrays inside 2DArray: "+ students.length);

        // how many values in second row (inner array)?
        System.out.println("how many values in second row (inner array)?" + students[1].length);

        // loop through inner arrays
        for(String[] eachArr  : students ){
            //loop through values in every inner array
            for(String value : eachArr){
                System.out.print( value+" ");
            }

            System.out.println();
        }

        // Task1: Find oldest student and print his name
        // first get only age values
        String oldestPersonName = students[0][1];
        int ageOfOldestPerson = Integer.parseInt(students[0][2]);
        for(String[] row : students){
            // go through every row and get
            // value only from 3rd column
            System.out.println(row[2]);

            // it is better to convert String to compare
            int age = Integer.parseInt( row[2] ); // convert string ==>> into int
            if(  age > ageOfOldestPerson){
                 ageOfOldestPerson = Integer.parseInt( row[2] );
                 oldestPersonName = row[1];
            }
        }
        System.out.println( oldestPersonName);

    }
}
