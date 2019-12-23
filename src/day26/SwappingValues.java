package day26;

import java.util.Arrays;

public class SwappingValues {

    public static void main(String[] args) {
        String name1 = "Emma";
        String name2 = "Jason";
        // name2 should have Emma , name1 should have Jason
        //name1 = name2 ;
        //name2 = name1 ;
        String tempName = name1;
        name1 = name2;
        name2 = tempName;
        System.out.println("name1: "+name1);
        System.out.println("name2: "+name2);

        // swap the value of first item and last item
        int[] myNumbers = new int[]{10, 40, 30, 7};
        int tempItem = myNumbers[0];
        myNumbers[0] = myNumbers[3];
        myNumbers[3] = tempItem ;
        System.out.println(Arrays.toString(myNumbers));

        // swap the value of first item and last item
//        int[] myNumbers = new int[]{10, 40, 30, 7};
        int temp2 = myNumbers[1];
        myNumbers[1] = myNumbers[2];
        myNumbers[2] = temp2;
        System.out.println("myNumbers = " + Arrays.toString(myNumbers));


    }
}
