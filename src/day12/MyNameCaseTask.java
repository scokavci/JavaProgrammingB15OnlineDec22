package day12;

public class MyNameCaseTask {

        public static void main(String[] args) {

            String myName = "Sumeyye";

            boolean myNameCorrect = myName.equals("Sumeyye");
            System.out.println(myNameCorrect);

            boolean myNameIgnoreCase = myName.equalsIgnoreCase("SUMEYYE");
           // System.out.println( myNameIgnoreCase);
            System.out.println( myName.equalsIgnoreCase("SUMEYYE"));
        }
    }


