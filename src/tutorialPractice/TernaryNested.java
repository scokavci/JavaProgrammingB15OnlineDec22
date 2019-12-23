package tutorialPractice;

public class TernaryNested {
    public static void main(String[] args) {

        int bill = 2000;
        int quantity = 15;
        int discount;

        if (bill > 1000) {
            if (quantity > 11) {
                discount = 10;
            } else {
                discount = 9;
            }
        }else {
            discount = 5;
        }
        // this is ternary nested condition statement
          discount = (bill > 1000) ? (quantity > 11) ? 10 : 9 : 5;
          System.out.println(discount);
    }
}
