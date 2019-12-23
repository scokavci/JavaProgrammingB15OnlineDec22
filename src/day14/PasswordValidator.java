package day14;

public class PasswordValidator {
    public static void main(String[] args) {
    // TASK : PASSWORD VALIDATOR

    // MIN 8 CHAR MAX 16 CHAR
    // IT MUST CONTAINS _ OR $
    // IT MUST NOT CONTAIN SPACE
    // IT MUST START Ab

    // if any of condition does not match say INVALID PASSWORD
    // else say GOOD PASSWORD !

    String password = "Ab_12321$12csa";

    // MIN 8 CHAR MAX 16 CHAR
    // password.length() >= 8 && password.length() <=16
    boolean min8max16 = password.length() >= 8 && password.length() <=16;

    // IT MUST CONTAINS _ OR $
    // password.contains("_") || password.contains("$")
    boolean mustContains_or$ = password.contains("_") || password.contains("$");

    // IT MUST NOT CONTAIN SPACE
    // !password.contains(" ")
    boolean mustNotContainSpace = !password.contains(" ");

    //IT MUST START Ab
    // password.startsWith("Ab")
    boolean mustStartsWithAb = password.startsWith("Ab");

        if(min8max16 && mustContains_or$ && mustNotContainSpace && mustStartsWithAb){
        System.out.println("VALID PASSWORD");
    }else{
        System.out.println("INVALID PASSWORD");
    }


   }
}


