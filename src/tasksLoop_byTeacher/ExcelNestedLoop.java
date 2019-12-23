package tasksLoop_byTeacher;

public class ExcelNestedLoop {
    public static void main(String[] args) {
//        THIS IS HOW WE READ EXCEL
//        Cell(1,1) Cell(1,2) Cell(1,3) Cell(1,4)
//        Cell(2,1) Cell(2,2) Cell(2,3) Cell(2,4)
//        Cell(3,1) Cell(3,2) Cell(3,3) Cell(3,4)
//        Cell(4,1) Cell(4,2) Cell(4,3) Cell(4,4)
//        Cell(5,1) Cell(5,2) Cell(5,3) Cell(5,4)
//        Cell(6,1) Cell(6,2) Cell(6,3) Cell(6,4)

//        Nested Loop Practice, has no relationship with array here.
//        Generate above output using nested loop
//        The program is stimulating an Excel sheet with 6 rows and 4 columns

//        for (int row = 1; row <= 6 ; row++) {
//            for (int col = 1; col <=4 ; col++) {
//                System.out.print("Cell ("+ row+","+col+")"+" ");
//            }
//            System.out.println();
//        }
//
        int row = 1;
        while(row<=6){
            int col = 1;
            while(col <=4){
                System.out.print("Cell ("+row+" ,"+ col+")"+ " ");
                col++;
            }
            row++;
            System.out.println();
        }

    }
}
