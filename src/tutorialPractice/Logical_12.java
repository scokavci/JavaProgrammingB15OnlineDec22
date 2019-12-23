package tutorialPractice;

public class Logical_12 {
    public static void main(String[] args) {
        System.out.println(false || false);
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(true || false);

        boolean bool = 4<10 || 4>5;
        System.out.println(bool);

        String drink = "coffee";
        // left side is true not checked right side // || faster circuit
        //left side false that time check tight side since it could be true
        bool = drink.equals("coffee") || drink.equals("tea");
        System.out.println(bool);

        String model = "BMW"; // okay AUDI // you need to be careful  && ||
        bool = model.equals("BMW") || model.equals("AUDI");
        System.out.println(bool);

        // ! means NOT
        System.out.println(!true);
        System.out.println(!false);
        bool = !true;
        System.out.println(bool);
        bool = !bool;
        System.out.println(bool);
      // another operator // ^ exclusive (like or but both true is false)
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ true);  // false given exception than or

        boolean hot = true;
        boolean free = true;
        System.out.println( hot ^ free);  // false even both true -->> exception
        //precedence of logical operators
        //! , && , ||

        System.out.println(!(false) || true && false);
        bool = !(3<5 && (4<6 || 6>10));
        System.out.println(bool);
    }
}
