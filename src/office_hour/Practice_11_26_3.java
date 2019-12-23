package office_hour;

public class Practice_11_26_3 {
    public static void main(String[] args) {

        //spring  , summer  , fall, --->>> bears are active
        //winter -->>> print bear sleep
        // same action for multiple cases. DRY principle. you don't need to repeat the same action
        String season = "spring";
        switch(season){
            case "spring":
            case "summer":
            case "fall":
                System.out.println("bear is active");
                break;
            case "winter":
                System.out.println("bear is sleeping");
        }
//
//        String season = "spring";
//        if(season.equals("spring") || season.equals("fall") || season.equals("summer")){
//            System.out.println("bear is active");
//        }else if(season.equals("winter")){
//            System.out.println("bear is sleeping");
//        }
    }
}
