package day21;

public class Hello {
    public static void main(String[] args) {
        String name = "Hello";

        for(int x = 0 ; x<=name.length()-1;x++) {
            System.out.print(   name.substring(x ,x+1)+"->"    );
        }
    }
}
