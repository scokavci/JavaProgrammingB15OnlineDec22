package tasksMethod;

public class FahrenheittoCelcius {
//    turn it into a method called fahrenheitToCelsius ,
//    this method have one double parameter fahrenheit and it calculate the celsius value
//    and print the result

    public static void main(String[] args) {
        fahrenheitToCelsius(78);

    }

    public static void fahrenheitToCelsius(double fahrenheit) {
        double celsius;
        celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println(fahrenheit + "F equals to " + celsius + "C.");
    }
}
