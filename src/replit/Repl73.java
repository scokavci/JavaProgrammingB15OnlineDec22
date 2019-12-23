package replit;

import java.util.Scanner;

public class Repl73 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String email = scan.next();

    String firstName = email.substring(  0,email.indexOf("_")   );
    String lastName = email.substring(  (email.indexOf("_")+1), (email.indexOf("@"))  );

    String firstNameChanged = firstName.toUpperCase().substring(0,1);
    String newfirstName = firstNameChanged+firstName.toLowerCase().substring(1 );

    String lastNameChanged = lastName.toUpperCase().substring(0,1);
    String newlastName = lastNameChanged+lastName.toLowerCase().substring(1);


    String domain = email.substring((email.indexOf("@"))+1, email.indexOf("."));

    String topdomain = email.substring(email.indexOf(".")+1);
   System.out.println("First name: "+newfirstName+"\n"+
            "Last name: "+newlastName+"\n"+"Domain: "+domain+"\n"+"Top-Level Domain: "+
    topdomain);
  }
}
