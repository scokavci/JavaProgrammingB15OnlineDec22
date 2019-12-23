package day14;

public class TrimAndIsEmpty {

    public static void main(String[] args) {

        String message = "   REPL IS COMING !  ";
        System.out.println(message);
        System.out.println("message character count is "+ message.length()  );

 // trim method is used to take out spaces on two sides not between words.

          message = message.trim();
          System.out.println(message);
       // System.out.println(  message.trim()    );
       // after trim, spaces both sides will be trimmed but my reference variable is not pointing  what it was trimmed.
       // object that was pointed  is the one same. that's why we have same length.
        // String is immutable
        // if we reassign our reference variable, we will get the length after trimming method.

        System.out.println("message character count is "+ message.length()  );

        System.out.println(message.isEmpty());

    }
}
