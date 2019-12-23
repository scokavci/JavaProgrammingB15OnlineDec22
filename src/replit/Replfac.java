package replit;

import java.util.Scanner;

public class Replfac {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int fact = 1;

        if (n > 0) {
            for (int x = 1; x <= n; x++) {

                fact = fact * x;
            }
            System.out.println(fact);
        }
    }
}
