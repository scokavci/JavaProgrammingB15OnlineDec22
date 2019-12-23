package tasksArray;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
//        Optionally : keep asking user until the user input row and column are not out of range.
//        2, Write a program to search a value in excel and print the all location of the value :
//        for example : 67 --> Cell(4,1)  Cell(4,4) Cell(6,1)
//        3, Write a program to ask user for column number and print only that column data :
//        for example : 2 -->  54 , 44 , 88 , 33 , 88 , 33


 //       1.0: Write a program to ask user row and column number and return the value in that cell.
//        if it's invalid row or column number , it should print invalid input.
//        for example : row 1 and column 4 has 84
//        row 7 and column 1 -->> INVALID! There are only 6 row and 4 columns
  //      int[][] row = {
//                {78, 54, 100, 84},  //0
//                {33, 44, 77, 123},  //1
//                {12, 88, 52, 76},   //2
//                {67, 33, 98, 67},   //3
//                {12, 88, 52, 45},   //4
//                {67, 33, 98, 34}    //5
//        };
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter row number: ");
                  int row   = scan.nextInt();
        System.out.println("Enter column number:");
                  int column = scan.nextInt();
        int[][] data = new int[6][4];

        if(row != 6 || column != 4){
            System.out.println("INVALID INPUT!");
        }
        System.out.println("Enter first row: ");
        String row1= scan.nextLine();
        scan.nextLine();
        System.out.println("Enter second row: ");
        String row2= scan.nextLine();
        System.out.println("Enter third row: ");
        String row3= scan.nextLine();
        System.out.println("Enter fourth  row: ");
        String row4= scan.nextLine();
        System.out.println("Enter fifth row: ");
        String row5= scan.nextLine();
        System.out.println("Enter sixth row: ");
        String row6= scan.nextLine();

    }
}
