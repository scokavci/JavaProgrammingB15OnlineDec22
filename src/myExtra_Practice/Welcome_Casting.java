package myExtra_Practice;

public class Welcome_Casting {
    public static void main(String[] args) {
        int n = 78;
        char mychar = (char)n; // casting expilicity conversion from int to char

        System.out.println(mychar);
        char letter = 'W';
        int number = letter;
        System.out.println(letter+" represents "+number);
        char letter1 = 'E';
        int number1 = letter1;
        System.out.println(letter1+" represents "+number1);
        char letter2 = 'L';
        int number2 = letter2;
        System.out.println(letter2+" represents "+number2);
        char letter3 = 'C';
        int number3 = letter3;
        System.out.println(letter3+" represents "+number3);
        char letter4 = 'O';
        int number4 = letter4;
        System.out.println(letter4+ " represents "+number4);
        char letter5 = 'M';
        int number5 = letter5;
        System.out.println(letter5+ " represents " +number5);
        char letter6 = 'E';
        int number6 = letter6;
        System.out.println(letter6+" represents "+number6);
    }
}
