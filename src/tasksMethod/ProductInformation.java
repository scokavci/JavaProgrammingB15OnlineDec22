package tasksMethod;

public class ProductInformation {

    public static void main(String[] args) {
//         turn it into a method called printProductInfo ,
//        this method  have 4 parameters and print any product information
        printProductInfo("Fire", "HD" ,8, 79.99f);
    }

    public static void printProductInfo(String productName , String model, int version, float price) {
        System.out.println("I saw " + productName + " " + model + version + " hands-free with Alexa for " + price);
    }
}
