package myExtra_Practice;

public class MyComparison {
    public static void main(String[] args) {
        int num1 = 55;
        int num2 = 56;
        System.out.println(num1 <= num2);
        double price1 = 12.34;
        double price2 = 14.67;
        System.out.println(price1 >= price2);

        boolean test = price1 != price2;
        System.out.println(test);
        System.out.println(price1 == price2);

        char letter1 ='A';
        char letter2 ='B';
        System.out.println(letter1 >= letter2);

        boolean b1 = letter1 >= letter2;
        boolean b2 = letter2 >= letter1;
        boolean b3 = false != true;
        System.out.println(b3);
    }
}
