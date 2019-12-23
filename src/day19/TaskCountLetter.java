package day19;

public class TaskCountLetter {
    public static void main(String[] args) {
        //find out how many 'a' letters
        String name ="Esra Fidan";

        int countOfA = 0;

        for (int x = 0; x < name.length(); x++) {
            //System.out.println(   name.charAt(x) );
            char currentChar = name.charAt(x);
            if( name.charAt(x) == 'a'){
                System.out.println("BINGO FOUND IT!!  ");
                ++countOfA;
            }
        }
        System.out.println("countOfA = " + countOfA);
    }
}
