package day08;

public class MultiBranchIfStatement {
    public static void main(String[] args) {
        // pseudo code
        // given your current speed and speed limit
        // check whether current speed is
        // more than speed 90 --->> jail

        int currentSpeed = 90;
        int speedLimit = 60;

        if(currentSpeed > 70){
            System.out.println(" you are speeding more than 70 -- POINTS TAKEN!!!!  ");
        }else if (currentSpeed > 60){
            System.out.println("warning");
        } else {
            System.out.println("keep driving you are good!!!");
        }
    }
}
