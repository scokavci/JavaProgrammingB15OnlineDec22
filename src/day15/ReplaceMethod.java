package day15;

public class ReplaceMethod {
    public static void main(String[] args) {

        // replace method of the String
        String message = "I love Pumpkin , Pumpkin IS FUN!";

        message = message.replace("Pumpkin", "Java!");

        System.out.println(message);

        // what if I want to replace space from everywhere
        String message2 = "Happy Thanks Giving to All!!";
        // I want to turn this -->>> Happy Thanksgiving to All!!

        message2 = message2.replace("Thanks Giving" , "Thanksgiving");
        System.out.println("message2 = " + message2);

        message2 = message2.replace("!!" , "!");
        System.out.println("message2 = " + message2);

        // remove all the space
        message2 = message2.replace(" " , "");
        System.out.println("message2 = " + message2);

        String message3 = "TOMORROW IS OFF NO!";
        // how do we remove NO!
        System.out.println(    message3.replace("NO!" , ""));

    }
}
