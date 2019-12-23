package day12;

public class Weather_Switch {
    public static void main(String[] args) {

        String weather = "Sunny";

        switch(weather){
            case "Sunny":
                System.out.println("Code in Sunny weather");
                break;
            case "Rainy":
                    System.out.println("Code in Rainy weather");
                    break;
            case "Cloudy":
                        System.out.println("Code in Cloudy day");
                        break;
            case "Snowy":
                System.out.println("Code in Snowy day");
                break;
            default:
                System.out.println("rain or shine just keep coding anyway!!!");
                break;
        }
    }
}
