package office_hour;

import java.util.Scanner;

public class Practice_11_25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1, num2, num3, sum;
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        sum = num1 + num2 +num3;
        System.out.println("Sum of numbers: "+sum);
    }


}
