package day21;

public class LoopControlStatement2 {

    public static void main(String[] args) {
        // continue
        // if line contains continue reaches, the loop will skip to the next iteration
        for (int x = 1; x <=10 ; x++) {
            if(x%2 != 0){
                continue;
            }
            System.out.println(x);

        }

    }
}
