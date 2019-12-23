package myExtra_Practice;

public class ShortHandOperators {
    public static void main(String[] args) {

        int guests = 5;
            guests += 3;
        System.out.println(guests);
            guests -= 4;
            ++guests;
            guests++;
            --guests;
            guests--;
            guests *= 2;
            guests /= 2;
        System.out.println(guests);
        int minutes = 300;
        minutes %= 5;
        System.out.println(minutes);

    }

}
