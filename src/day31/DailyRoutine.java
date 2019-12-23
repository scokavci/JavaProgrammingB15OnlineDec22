package day31;

public class DailyRoutine {
    public static void wakeUp(){
        System.out.println("open your eye");
        System.out.println("close your eye");
        System.out.println("hear your alarm ? open it again!");
        System.out.println("...............");
    }
    public static void drinkCoffee(){
        System.out.println("Put Coffee in the machine");
        System.out.println("Press the button make your coffee");
        System.out.println("..............");
    }
    public static void prepareKidsForSchool(){
        System.out.println("Kiss them first");
        System.out.println("Wake them up 10 times");
        System.out.println("Prepare breakfast");
        System.out.println("Eat with them");
        System.out.println(".............");
    }
    public static void takeThemToSchool(){
        System.out.println("take them to by car");
        System.out.println(" say bye to them");
        System.out.println("kiss them");
        System.out.println("..............");
    }
    public static void studyJava(){
        System.out.println("Think about Java");
        System.out.println("Review class");
        System.out.println("Listen short tutorials");
        System.out.println("Do repls");
        System.out.println("do tasks");
    }

    public static void sayILoveJava300Times(){
        for (int i = 1; i <= 300 ; i++) {
            System.out.print("I love Java | ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*
        wake up
        drinkCoffee
        prepareKidsForSchool
        takeThemToSchool
        gotoWork
        groceryShopping
        cooking
        studyJava
        goToSleep
         */
        wakeUp();
        drinkCoffee();
        prepareKidsForSchool();
        takeThemToSchool();
        studyJava();
        sayILoveJava300Times();
    }

}
