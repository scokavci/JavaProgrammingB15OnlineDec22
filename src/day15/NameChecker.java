package day15;

public class NameChecker {

    public static void main(String[] args) {

        String name = "Avni";
         if(name.length() < 4){
             System.out.println("short name");
         }else if( name.length() >= 4 && name.length() <= 11){
             System.out.println("medium name");
         }else if ( name.length() > 11){
             System.out.println("long name");
         }
              if (name.contains("A") || name.contains("e")){
                  System.out.println("name contains A or e");
         } else{
             System.out.println("I don't have both a or e in my name");
         }

    }
}
