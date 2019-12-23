package tasksStringby_Teacher;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
//        Task 6:
//        Ask user to enter full name
//        assuming full name is 2 word
//        Write a program generate email account as below:
//        it starts with first character of first name
//        and whole last name then @NightWatch.com
//        for example :
//        Jon Snow -->> JSnow@NightWatch.com

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");

        String fullName = scan.nextLine();

        char firstCharacter = fullName.charAt(0);
        int  i = fullName.indexOf(" ");
        int  j = i+1;
        String lastname = fullName.substring(j);

        System.out.println(firstCharacter+""+lastname+"@NightWatch.com");

    }
}
