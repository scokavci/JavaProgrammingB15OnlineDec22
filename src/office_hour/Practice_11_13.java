package office_hour;

public class Practice_11_13 {
    public static void main(String[] args) {
        double potatoPrice = 12.99d ;
        // if a fractional number appear , compiler automatically assume it's a double
        // so d is optional but highly recommended
        double bananaPrice = 12.99;

        float ipadSize1 = 12.9f ;

        double ipadSize2 = 12.9f ;
        // double can hold any type of number because it has largest range
        double bankBalance = 3000;

        System.out.println( bankBalance );
        // be careful, bear shouldn't ingest large fluffy dog
        //boolean, char,
        //byte, short, int, float, long

        char myFavoriteCharacter = 'A';
        char myFavoriteCharacter2 = 65;
        // each character has its own number representation in ASCII table
        // both of them will result letter A because data type is char for both of them
        System.out.println(myFavoriteCharacter);
        System.out.println(myFavoriteCharacter2);

        String todaysTopic = "Arithmetic Operator and Scanner , class duration is 3 hour";

        System.out.println("Topic and duration  : \n " + todaysTopic);


       char myNine = '9'; // storing character will work
       //char myNine2 = '99';
        // storing charcter 99 will not work because it has more than one character

        System.out.println(myNine);





    }
}
