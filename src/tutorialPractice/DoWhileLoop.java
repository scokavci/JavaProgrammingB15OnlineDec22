package tutorialPractice;

public class DoWhileLoop {
    public static void main(String[] args) {

        int apples = 1;
        int totalApples = 10;

        do{
            System.out.println("Apples are collected");
            apples++ ;
        }while(  apples <= totalApples);
        System.out.println(totalApples);

        int number =1 ;
        int till = 10;

        do{
            System.out.print(number+ " ,");
            number++ ;
        }while(number <=10);

        int num = 1;
        int until = 17;
        do{
            System.out.print(until + " ,");
            until-- ;
        }while( until >= num  );


    }
}
