package day09;

public class LanguagePicker {
    public static void main(String[] args) {
        System.out.println("Welcome to Cybertek Call Center ");
        System.out.println("Please select your language option from 1-7 ");
        
      String greeting = "";
      int languageOption = 5;

      if(languageOption == 1){
          greeting = "Hello, SDET";
      }else if(languageOption ==2){
          greeting = "Salam, SDET";
      }else if(languageOption ==3) {
          greeting = "Hola, SDET";
      } else if(languageOption ==4) {
          greeting = "Privet,SDET";
      } else if(languageOption ==5) {
          greeting = "Merhaba,SDET";
      }else if(languageOption ==6) {
          greeting = "Szia,SDET";
      }else if(languageOption ==7) {
          greeting = "bonjour,SDET";
      }else{
          System.out.println("unknown language");
      }
        //INSTEAD OF WRITING EACH LINE SDET you can write this
        // "Hello, SDET         // greeting = greeting +", SDET";
         System.out.println(greeting);

    }
}
