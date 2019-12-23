package day22;

public class TaskByteArray {
    public static void main(String[] args) {

        // create a byte array with size 4
        // and store it into a variable called data
        // assign value for each index location
        //access them and print
        // update last index value
        //then print it out

        byte[] data = new byte[4];
        data[0] = 10;
        data[1] = 25;
        data[2] = 36;
        data[3] = 44;

        System.out.println( data[0] );
        System.out.println( data[1] );
        System.out.println( data[2] );
        System.out.println( data[3] );


        data[3] = 60 ;
        System.out.println(data[3]);

    }
}
