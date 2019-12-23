package office_hour;

    public class Practice_11_27_1 {

        public static void main(String[] args) {

            String message = "  I      LOVE  JAVA     ";
            System.out.println("message = < " + message + ">");
            // trim -->> take out spaces at beginning and ending of a String Object
            // it does not take out space in between characters. ONLY BEGINNING AND ENDING -> TWO SIDES
            String messageTrimmed = message.trim();
            System.out.println("messageTrimmed = <" + messageTrimmed + ">");

            //isEmpty -->> check whether a String object is empty, meaning there is nothing inside""
            //isEmpty = yourString.length() == 0 -->> true

            String emptySpaces = "             ";
            System.out.println("emptySpaces = < " + emptySpaces+ ">" ) ;

            String emptySpacesAfterTrimmed = emptySpaces.trim();
            System.out.println("emptySpacesAfterTrimmed length is : " + emptySpacesAfterTrimmed.length()   );
            System.out.println("emptySpacesAfterTrimmed is empty??? " + emptySpacesAfterTrimmed.isEmpty()  );

            //isEmpty()   VS isBlank() method from String class.
            // what is difference:
            // isEmpty() -->>> if (yourString.length() > 0) true else {false}
            //isBlank --> if you have only WHITE SPACES, GET TRUE, ELSE GET FALSE
            System.out.println("emptySpaces is blank or not ??"+emptySpaces.isBlank()  );

            //                   0123456789112345678921
            // String message = "  I      LOVE  JAVA     ";
            int locationOfLove = message.indexOf("LOVE");
            System.out.println("locationOfLove = " + locationOfLove);

            int lastIndexOfLetterA = message.lastIndexOf("A");
            System.out.println("lastIndexOfLetterA = " + lastIndexOfLetterA);

            // contains : -->> check whether a String exists inside another String and return true false

            boolean messageContainsLove = message.contains("LOVE");
            System.out.println("messageContainsLove = " + messageContainsLove);
        }
    }



