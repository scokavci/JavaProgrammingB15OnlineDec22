package office_hour;

public class Practice_12_11 {
    public static void main(String[] args) {

        String fruits[] = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        //index                0        1         2         3           4           5
        //length: return the totral number of elements

        // 1.7 print out only those items end with letter e
        for (int i = 0; i < fruits.length; i++) {
            String str = fruits[i];
            // one method
//            if(str.endsWith("e")){
//                System.out.println(str);
//            }
            // second method
            if (!str.endsWith("e")) {
                continue;
            }
            System.out.println(str);

        }
        for (int i = 0; i < fruits.length; i++) {
            /*
            for( Variable name : collection of data){
             variable  must be representing each elements of the collection of data
             */
        }
        for (String eachFruit : fruits) {
            char lastChar = eachFruit.charAt(eachFruit.length() - 1);
            //System.out.println(lastChar);
            if (lastChar == 'e') {
                System.out.println(eachFruit);
            }
        }

        System.out.println("==================================");

        // 1.8 print out only  last 3 characters of all the items
        for (int i = 0; i < fruits.length; i++) {
            String last3 = fruits[i].substring( fruits[i].length() -3 , fruits[i].length()  );
            System.out.println(last3);
        }

        for(String eachFruit : fruits){
          //  String last3 = eachFruit.substring(eachFruit.length() -3);
            // or charAt yontemi
            String last3 =""+eachFruit.charAt(eachFruit.length()-3) +
                    eachFruit.charAt(eachFruit.length()-2) +eachFruit.charAt(eachFruit.length()-1) ;
        }

      float[] prices = {  1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f };
            float max = 0;
        for (float eachPrice : prices){
            if(eachPrice > max){
                max = eachPrice ;
            }
        }
        System.out.println(max);
        System.out.println("......................");
        float max2 = prices[0];
        for(float eachPrice : prices){
            if(eachPrice < max2){
                continue;
            }
            max2 = eachPrice ;
        }
        System.out.println(max2);

        float secondMax = prices[0] ;  // store the second max number

        for(float eachPrice : prices){
            if(eachPrice > secondMax && eachPrice<max){
                secondMax = eachPrice ;
            }
        }
        System.out.println(secondMax);

        //find the index number of second maximum number
        for (int i = 0; i < prices.length ; i++) {
            if(prices[i] == secondMax){
                System.out.println("index number of "+secondMax+ " is: "+i);
            }
        }

        // find the index num of max price
        for (int i = 0; i < prices.length ; i++) {
            if(prices[i] == max){
                System.out.println("index number of "+max+ " is: "+i);
            }
        }

    }
}