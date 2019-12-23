package tasksMethod;

public class TaskPrint {

    public static void main(String[] args) {
        sayTheGoldenSentence("I can do it", 300);
    }
    public static void sayTheGoldenSentence(String sentence , int count){
        for (int i = 1; i < count; i++) {
            System.out.println(sentence);
        }
        System.out.println();
    }
}
