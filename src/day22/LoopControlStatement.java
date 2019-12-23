package day22;

public class LoopControlStatement {
    public static void main(String[] args) {
        // print every other letter
        // meaning skip a letter each time you go through
        // break third j letter
        String msg = "I struggle with Java I like Java I love Everything is Awesome!";
        int counter = 0;
        String newmsg="";

        for (int i = 0; i <=msg.length()-1 ; i++) {
            if( i%2 != 0){
                continue;
            }
             newmsg = msg.substring(i,i+1);
            if( newmsg.equalsIgnoreCase("j")) {
                break;
            }
            System.out.print(newmsg);
        }
    }
}
