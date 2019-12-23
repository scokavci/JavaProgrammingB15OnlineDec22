package myExtra_Practice;

public class Increment_Decrement_Prefix {

    public static void main(String[] args) {

        int apples = 0;
        System.out.println(apples);
        System.out.println(++apples);
        System.out.println(apples);
        System.out.println(apples++);
        System.out.println(apples);
        apples--;
        System.out.println(apples);
        System.out.println(--apples);

        int pears = 3;
        int basket = (++pears*5/pears-- + --pears );
        System.out.println(basket);
        System.out.println(pears);

        int counter = 10;
        counter += 1;
        ++counter;
        counter++;
        System.out.println(counter);

        int basket2 = 15;
        basket2 = basket2 -1;
        basket2 -= 1;
        --basket2;
        basket2--;
        System.out.println(basket2);

    }
}
