package tasksStringby_Teacher;

public class Task14 {
    public static void main(String[] args) {
                         //0123456789012345678901
        String sentence = "I love Java Java Java";
        int len = sentence.length();
        System.out.println(  sentence.substring(17,21)    );

        sentence = sentence.substring(0,16);
        System.out.println("sentence = " + sentence);

        int newLen = sentence.length();

        if(len == newLen) {
            System.out.println(sentence.contains(" last java"));
        }else {
            System.out.println("not last Java");
        }

    }
}
