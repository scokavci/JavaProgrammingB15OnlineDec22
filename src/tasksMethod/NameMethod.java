package tasksMethod;

import org.w3c.dom.ls.LSOutput;

public class NameMethod {
    public static void main(String[] args) {
        reversePrintMyOwnName();
        nameReversed("Huseyin");
        printLastCharacterOfName("Vehbi");
        printFullNameInformation("Vehbi", "Cokavci");
    }


//    reversePrintMyOwnName
    public static void reversePrintMyOwnName() {
        String name = "Vehbi";
        for (int i = name.length()-1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println();
    }

//* create a method that has 1 String parameter called name
//    and print that name in reversed order
    public static void nameReversed(String name){
        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println();
    }
//            printLastCharacterOfName
//* create a method that has 1 String parameter called name
//    and print last character of that name
    public static void  printLastCharacterOfName(String name){
        System.out.println(name.charAt(name.length()-1));
    }
//            printFullNameInformation
//* create a method that has 2 String parameter called firstName,lastName
//    and print "Your first name is firstName , Your last Name is lastName
//    print " your full name length is lengthOfTheFullName"
    public static void printFullNameInformation(String firstName, String lastName){
        System.out.println("Your first name is "+firstName+". Your last name is "+ lastName);
        String fullName = firstName+lastName ;
        int lengthOfTheFullName = fullName.length();
        System.out.println("lengthOfTheFullName = " + lengthOfTheFullName);
    }
}
