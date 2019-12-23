package day12;

public class LoginTest_V2 {
    public static void main(String[] args) {

        String userName = "abc123";

        boolean  userNameCorrect = userName.equals("ABC123");
        System.out.println(  userNameCorrect );

// when we use IgnoreCase, value can be changed uppler to lower case. not a problem.

        boolean nameCheckIgnoreCase = userName.equalsIgnoreCase("ABC123");

        System.out.println( nameCheckIgnoreCase  );
    }
}
