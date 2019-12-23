package day17;

public class NameCorrector {
    public static void main(String[] args) {

        String name = "sumeyye";
        //get the first character  -->> upper case
        //get the rest of the characters starting from 2nd character

        // 1st way to do: make all name uppercase then get the first character
        //rest of them make lower case and concatenate them
        // character is not a string we can not use method. add string to character it turns string.
//        String nameFixed = (name.charAt(0)+"").toUpperCase();
//               nameFixed = nameFixed + name.substring(1).toLowerCase();

        String nameFixed = name.toUpperCase().substring(0,1);
               nameFixed += name.substring(1).toLowerCase();

        System.out.println("nameFixed = " + nameFixed);
    }
}

