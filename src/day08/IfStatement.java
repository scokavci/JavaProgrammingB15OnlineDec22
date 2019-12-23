package day08;

public class IfStatement {
    public static void main(String[] args) {

        int speedLimit = 60;
        int yourCurrentSpeed = 100;

        boolean iAmSpeeding = ( yourCurrentSpeed > speedLimit );
        //if (iAmSpeeding){
        //if(true){

        if( yourCurrentSpeed > speedLimit){
            System.out.println(" Get pull over by the police! \n given ticket by the police");
            System.out.println(" taken away some points on your license \n go to court");
        } else{
            System.out.println("Go shopping!!");
            System.out.println("Buy ice cream!! \n Enjoy your day!!");
        }

        System.out.println("THE END");
    }
}
