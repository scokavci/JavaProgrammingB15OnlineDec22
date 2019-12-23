package day26;

import java.util.Arrays;

public class StringSplitPractice {

    public static void main(String[] args) {
        // first get all the name into String array called namesArray
        // Spell the name of each person in this format
        // exclude space if you get space in names
        // A-b-b-o-s-  .....
        // Z-u-l-y-a-r-  ....
        // Optionally count a from each name and print

        String  students = "Abbos, Zulyar,Zhibek,Hasan,Muge, Orhan,Susan";

        students = students.replace(" ","");
        String[] nameArray = students.split(",");
        System.out.print( Arrays.toString(nameArray));
        System.out.println();
        System.out.println("length of namesArray "+nameArray.length);

//        char[] character = students.toCharArray();
//
//        for(char eachchar : character){
//            System.out.print(eachchar+"-");
//        }
        //System.out.println();

        int studentCount = nameArray.length ;
        int countOfa = 0;
        for (int x = 0; x < studentCount ; x++) {
            String name = nameArray[x];
            if(name.contains("a")){
                countOfa++;
                System.out.println( nameArray[x] + " has "+countOfa);
            }
            System.out.println(name);
               for (int i = 0; i < name.length(); i++) {
                    System.out.print(name.charAt(i) + "-");
                }
                System.out.println();

        }

    }

}

