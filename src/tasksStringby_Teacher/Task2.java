package tasksStringby_Teacher;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String with any number of word");
        String searchKeyword = scan.nextLine();
        String tabTitle = "";
        tabTitle = searchKeyword+ " - Google Search";

        if(   tabTitle.startsWith(searchKeyword) && tabTitle.endsWith(" - Google Search")){
            System.out.println("The test has passed");
        }else {
            System.out.println("test has failed");
        }

    }
}
