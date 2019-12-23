package day11;

public class LightIf {
    public static void main(String[] args) {

        String targetOption = "Bd";
        if(targetOption == "Bd"){
            System.out.println("You turn on bedroom light");
        }else if(targetOption == "Lr") {
            System.out.println("You turn on living room light");
        }else if(targetOption == "ki") {
            System.out.println("You turn on kitchen light");
        }else if(targetOption == "ha") {
            System.out.println("You turn on living room light");
        } else {
            System.out.println("There is no such light");
        }
    }

}
