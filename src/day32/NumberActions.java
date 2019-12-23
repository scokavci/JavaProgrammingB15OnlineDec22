package day32;

public class NumberActions {
    public static void main(String[] args) {
        numberComparison(20,30);
        stringRepeater("Keep Study Hard", 10);
        skipCountBy3From0To50();
        countDownByEvenNumberFrom50To0();
        print1ToX(35);
        countDownByEvenNumberfromXToY(10,6);
    }
    /* create static void methods as below
       number comparison
       this method has 2 parameters num1 and num2
       if num1 is more than num2 print num1 is more than  num2
       if num2 is more than num1 print num2 is  more than num1
       if num2 are equals num1 print they are equal
       * String repeater
       this method has 2 parameters
       String strToRepeat and int count
       repeat printing the string as many time as <count> number define

     */
    public static void numberComparison(int num1, int num2){
        if(num1 > num2){
            System.out.println(num1+" is more than "+ num2 );
        }else if(num2 > num1){
            System.out.println(num2+" is more than "+ num1 );
        }else if(num1==num2){
            System.out.println("they are equal" );
        }
    }
    public static void stringRepeater(String strToRepeat, int count){
        for (int i = 0; i <=count ; i++) {
            System.out.println(strToRepeat);
        }
    }
    // skipCountBy3From0To50
    public static void skipCountBy3From0To50(){
        for (int i = 0; i <=50 ; i+=3) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
    // countDownByEvenNumberFrom50To0
  public static void countDownByEvenNumberFrom50To0(){ // this method is calling another method
//        for (int i = 50; i >=0 ; i--) {
//            if(i%2 ==0){
//                System.out.print(i+ " ");
//            }
//        }
//        System.out.println();
       countDownByEvenNumberfromXToY(50,0) ;
// we reusing code like calling a method inside another method not duplicate in order to have dynamic code
   }
    // instead of counting even numbers from 50 to 0
    //count down even numbers from x to y
    public static void countDownByEvenNumberfromXToY(int x , int y){
        for (int i = x; i >=y ; i--) {
            if (i%2 == 0) {
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }
    // print1toX
    public static void print1ToX(int x){
        for (int i = 1; i <= x ; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}
