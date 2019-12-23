package day31;

public class Greeting {
    public static void main(String[] args) {

         sayHelloTo("Batch 15"); // -->> print hello Batch 15
         sayHelloTo("Kids"); // -->> print hello Kids
         sayHelloTo("Study hard");

    }
    // I want to create a method that do below
    // say hello to the person's name I passed when I call this method
    // external data inside parenthesis ( String blabla) called method parameter
    // it's expecting this type of data when being called

    public static void sayHelloTo( String blabla){
        System.out.println("Hello "+blabla);
    }


}
