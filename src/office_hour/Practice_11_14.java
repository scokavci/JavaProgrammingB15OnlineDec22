package office_hour;

public class Practice_11_14 {
    public static void main(String[] args) {
        String name ="Sumeyye";
        System.out.println("My name is "+name);

        String city1 = "NYC";
        String city2 = "DC";
        int hour = 5;

        System.out.println("From "+city1+ " to "+city2+" takes 5 hours by bus.");
        System.out.println("From "+ "NYC"+ " to "+"DC"+" takes "+hour+ " hours by bus.");

        System.out.println(city1 +5);     //string will result again NYC
        System.out.println(hour + 5);     //10   hour is number + is operator
        System.out.println("5"+ 5);      // "5" prints as 5 but + is not operator. it is concenation
    }
}
