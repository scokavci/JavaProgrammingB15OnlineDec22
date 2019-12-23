package day09;

public class CitizenTypeChecker {
    public static void main(String[] args) {
        String citizenType;
        int age = 70;

        if(age>65){
            citizenType = "senior";
        }else{
            citizenType = "not Senior";
        }
        System.out.println("The citizen age is "+age+" and he is a "+citizenType+".");
    }
}
