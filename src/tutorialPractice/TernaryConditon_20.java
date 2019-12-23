package tutorialPractice;

public class TernaryConditon_20 {
    public static void main(String[] args) {

        int n1 = 5 , n2 = 10;
        int max;
//        if(n1>n2){
//            max = n1;
//        }else {
//            max = n2;
//        }
            max = (n1 > n2) ? n1 : n2;
        System.out.println(max);
        int bill = 1400;
        int discount = (bill > 2000) ? 15 : 10;
        System.out.println(discount);

        String action="";
        boolean isGreen = true;
        if (isGreen == true){
            action = "you can drive";
        } else {
            action = "Stop!!";
        }
        System.out.println(action);

            // ternary operator instead of if condition
            action = (isGreen) ? "can drive" : "cannot drive";
            System.out.println(action);

    }
}
