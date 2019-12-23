package day21;

public class NumberStairCaseBackward {
    public static void main(String[] args) {

        for (int x = 1; x <=10; x++) {
            for (int i = 10; i >= x ; i--) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        for (int z = 1; z <=10; z++) {
            for (int k = 1; k <=z ; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
