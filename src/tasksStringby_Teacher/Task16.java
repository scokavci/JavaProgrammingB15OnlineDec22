package tasksStringby_Teacher;

public class Task16 {
    public static void main(String[] args) {

        String word1 = "ABCDE";
        String word2 = "BC";

        if(word1.contains("BC")){
            int locationOfWord2 = word1.indexOf("B", 1);
            System.out.println("BC is at index "+locationOfWord2+" in word1");
           word1 = word1.replace("BC", "ZZZ");
            System.out.println("word1 = " + word1);
        }


    }
}
