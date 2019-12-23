package day11;

public class Light_Switch {
    public static void main(String[] args) {

    String targetOption = "Ki";

        switch(targetOption){
        case "Bd":
            System.out.println("You have turned on bedroom light ");
            break;
        case "Lr":
            System.out.println("You have turned on living room light ");
            break;
        case "Ki":
            System.out.println("You have turned on Kitchen light ");
            break;
        case "Ha":
            System.out.println("You have turned on hallway light ");
            break;
        default:
            System.out.println("There is no such light");
            break;

    }
   }
}


