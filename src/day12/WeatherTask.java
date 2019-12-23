package day12;

public class WeatherTask {

    public static void main(String[] args) {

        String weatherOfCity = "Sunny";

        if(weatherOfCity.equals("Sunny")   ){
            System.out.println("Code in Sunny weather");
        }else if(weatherOfCity.equals("Rainy")   ){
            System.out.println("Code in Rainy weather");
        }else if(weatherOfCity.equals("Cloudy")   ){
            System.out.println("Code in Cloudy weather");
        }else if(weatherOfCity.equals("Snowy")   ){
            System.out.println("Code in Snowy weather");
        }else {
            System.out.println("rain or shine just keep coding anyway!!!");
        }

    }
}

