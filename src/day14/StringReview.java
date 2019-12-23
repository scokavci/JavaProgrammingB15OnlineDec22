package day14;

public class StringReview {
    public static void main(String[] args) {

        String str = "I like Pumpkin";
        //System.out.println(str.equals("pumpkin") );
        System.out.println("str = " + str);
        // contains:
        // checks whether String exists in another String
        // also return true or false result
        System.out.println("Does it contain Pumpkin?");
        System.out.println(str.contains("Pumpkin"));
        // true
        // want to store result of true. create boolean
        boolean gotPumpkin = str.contains("Pumpkin");
        //shortcut to print variable in nice format soutv +tab
        System.out.println("gotPumpkin = " + gotPumpkin);

        // startsWith endsWith
        //  check whether a string start with another string
        // check whether a string end with another string
        // and return true or false result

        boolean startedWithI = str.startsWith("I");
        System.out.println("startedWithI = " + startedWithI);

        boolean endWithPumpkin = str.endsWith("Pumpkin");
        System.out.println("endWithPumpkin = " + endWithPumpkin);

    }
}