package reviewClass;

import java.util.Scanner;

public class FindHello {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int counOfhi = 0;
        for (int x = 0; x <= str.length() - 2; x++) {

            String hiWord = str.substring(x, x + 2);

            if (hiWord.equals("hi")) {
                System.out.println("Bingo at " + x);
               // countOfhi++;
               // System.out.println(countOfhi);
            }
        }
    }
}

