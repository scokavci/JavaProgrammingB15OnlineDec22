package day19;

public class WarmUp_SpeedUp {
    public static void main(String[] args) {
//        i did this way...same result
//        int end = 40;
//        for( int start=10; start < end; start++) {
//                System.out.print(start + " ");
//            }

        // I want to have a program that I can change start and end
        // to be able to program dynamically
        int start = 10;
        int end = 27;
        System.out.println("You have started at speed-->> ");
        for( int i = start ; i <= end ; i++){
            System.out.print( i+ ",");
        }
        }
    }

