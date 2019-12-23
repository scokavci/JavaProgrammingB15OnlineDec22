package myExtra_Practice;

public class IfPractice {
    public static void main(String[] args) {

        int apples = 10;
        int oranges = 5;
        if(apples > oranges){
            System.out.println("I have more apples than oranges. ");
        }
         String username = "abc";
         if(username.equals("abc")){
             System.out.println("Access accepted");
             System.out.println("Welcome Agent");
         }
         int books = 50;
         if(books <= 100){
             books += 10;
             System.out.println(books);
         }

         boolean hot = true;
         if( hot == true){
             System.out.println("Can I have an ice cream? ");
         }
    }
}
