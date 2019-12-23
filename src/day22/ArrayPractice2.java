package day22;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char[] name = new char[7] ;
        //what default value do we get for char array
        // we get c har represented by ascii code 0

        name[0] = 'S';
        name[1] = 'U';
        name[2] = 'M';
        name[3] = 'E';
        name[4] = 'Y';
        name[5] = 'Y';
        name[6] = 'E';

        for (int i = 0; i <7 ; i++) {
            System.out.print(name[i]);
        }
        System.out.println();
        // THIS WILL ACTUALLY PRINT THE CONTENT OF CHAR ARRAY NOT MEMORY ADDRESS
        // AND THIS IS ONLY FOR CHAR ARRAY , ANYTHING ELSE WILL PRINT MEMORY ADDRESS
        System.out.println(name);

        boolean[] yesNo = new boolean[3];
        yesNo[0] = true ;
        yesNo[1] = false ;
        yesNo[2] = 10>7 ;   // you can store anything gives result as true or false

        System.out.println( yesNo[0]   );
        System.out.println( yesNo[1]   );
        System.out.println( yesNo[2]   );
    }
}
