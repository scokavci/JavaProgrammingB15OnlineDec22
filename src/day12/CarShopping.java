package day12;

public class CarShopping {
    public static void main(String[] args) {
        // Buy Corolla (budget not important) OR Tesla (only if it is in the budget)
        // Corolla only type
        // but // Tesla and price together should be true so use (  ) both cases in the same paranthesis
        String carBrand="Tesla";
        int carPrice = 60000;
        double budget = 40000;

//   DRY principle: don't repeat yourself

//        if(  carBrand.equals("Corolla") ||  ( carBrand.equals("Tesla") && carPrice <= budget) ){
//            System.out.println(" CAR ACQUIRED !!! ");
//        }else {
//            System.out.println("NOT WHAT I AM LOOKING");
//        }
        if(carBrand.equals("Corolla")){
            System.out.println(" CAR ACQUIRED !!! ");

        } else if (carBrand.equals("Tesla") && carPrice < budget) {
            System.out.println(" CAR ACQUIRED !!! ");
        }else{
            System.out.println("NOT WHAT I AM LOOKING FOR");
        }

    }
}
