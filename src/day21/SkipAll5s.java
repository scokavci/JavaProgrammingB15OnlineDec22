package day21;

public class SkipAll5s {

    public static void main(String[] args) {
        // count 1 to 100
        // skip all numbers divisible by 5
//        for (int x = 1; x <= 100; x++) {
//            if ( x%5 == 0 ){
//                System.out.println("Skipping "+x);
//               continue;
//            }
//            System.out.print(x+",");
//        }
          // without continue statement
        for (int x = 1; x <= 100; x++) {
            if( x%5 !=0){
                System.out.println(x);
            }else{
                System.out.println("Skipping "+x);
            }
        }
    }
}
