package office_hour;

public class Practice_11_18 {
    public static void main(String[] args) {
      //compound operator \ shorthand operator
        // += , -= ,*= , /=

        // increment and decrement operator
        // ++ ++
        // ++aa   aa++
        //Relational operator
        //  >=     <= more or less
        // ==   !=

        //casting :converting one data type to another data type
        // converting a smaller range data type to bigger range data type
        // upcasting : TYPE WIDENING  , automatically = implicitly
        // int to long , int to double
        // double price = 99 but print 99.0;
        double price = 99;   // 99 --> 99.0
        long earthToMoon = 15000;   // when 15000 is stored, -->> 15000L
        //downcasting: TYPE NARROWING
        // converting data bigger range data to smaller range data type
        // double to int, long to short
        //this must happen explicitly (by USER) or IT WILL NOT COMPILE
        //  int priceWholeNumber = 99.45 ; ERROR!!!
        //  int priceWholeNumber = (int)99.45 ;  // 99  print  .45 lost
       int myMediumCup = (int) 100L;    // 100 is the range int so data type is important. casting must


//        special case of char to int
//        each character is represented by numbers in ASCII table
        char myLetter = 'A';
        System.out.println( myLetter);
        // int only stores number
        // ascii table each character has representation number of  each character
        int myLetter2 = 'A';
        System.out.println(myLetter2);

        int myLetter3 = 'a';
        System.out.println(myLetter3);

        char myLetter4 = 87;
        System.out.println(myLetter4);

       char myLetter5 ='8';
        System.out.println(myLetter5);
        //////////////////////////////////
        // ------positive and negative number in programming
        // +
        // + operator  -------  5 + 10 = 15;
        // concatenation ------ "Jon" +"Snow" = "Jon Snow"
        // increment operator ++x  , x++
        // it can also indicate a number is positive int i = +5; it's optional

        // -
        // - Arithmetic subtraction operator  -------  10 - 5 = 5;
        //  shorthand operator int x = 10 ; x -= 3 ; 7
        // DECREMENT OPERATOR  --x   , x-- decrease the number by 1
        // it can also indicate a number is negative int bankBalance = -190;   NOT optional

        int num = 10;
        System.out.println(  num == 10  );
        System.out.println(  num != 10  );

        // we can store the result of relational operation into boolean variable

        boolean isNumEqual10 = (num == 10);

    }
}
