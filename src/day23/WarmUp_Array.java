package day23;

public class WarmUp_Array {
    public static void main(String[] args) {

        int[] num = {1,2,3,4,5,6,7};

        for (int i = num.length-1; i >=0 ; i--) {
            System.out.print(  num[i]+" ");
        }

        System.out.println();
        int lastItem = num[num.length - 1];
        System.out.println("lastItem = " + lastItem);

        System.out.println("Middle number is "+   num[num.length/2] );
    }
}
