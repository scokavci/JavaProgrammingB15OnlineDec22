package day13;

public class NestedIf_DoYouWannaShop {
    public static void main(String[] args) {

        boolean youWantToShop = true;
        String preference = "Online";

        // if(youWantToShop) that is okay too since it is boolean

        if (youWantToShop == true) {

            if (preference.equals("store")) {
                System.out.println("Going to store for shopping");
            } else {
                System.out.println("Going to online for shopping");
            }

        } else {
            System.out.println("good job stay home coding!!!");
        }
    }
}
