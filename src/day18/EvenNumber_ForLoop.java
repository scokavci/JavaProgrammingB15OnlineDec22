package day18;

public class EvenNumber_ForLoop {
    public static void main(String[] args) {
       // starting from 0 to 100 skip by 2
        for(  int i = 0; i <100 ; i+=2){
            System.out.print( i+ " "   );
        }
        System.out.println();
        for( int x = 0 ; x < 100 ; x+=3){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("..............even number");

        for (int i = 0; i < 100; i++) {

            if( i % 2 == 0 ){
                System.out.print(i+ " ");
            }
        }
        System.out.println("..........................");
        for (int i = 0; i < 100 ; i++) {
             if( i%3 ==0  &&  i%5 == 0){
                 System.out.println( i+ " is FizzBuzz number");
             }
        }
    }
}
