package mentoringSession;

public class Task1_Array {
    public static void main(String[] args) {
//        create an int array of 6 elements and find out
           //int[] numbers2 = new int[6];
           //int[] numbers1 = new int[]{4, 18, 20, 15, 35, 70};
           int[] numbers = {4, 18, 20, 15, 35, 70}; // shortest way
            for(int i=0;i < numbers.length;i++){
                System.out.print(numbers[i]+" ");
            }
        System.out.println();
//        sum of all elements
          int sum = 0;
          for(int i=0; i < numbers.length;i++){
              sum += numbers[i]; // sum = sum+ numbers[i]
          }
        System.out.println("sum = " + sum);
//        average of the array
          int average = (sum/numbers.length );
        System.out.println("average = " + average);
//        sum of even numbers in the array
        int sumEven = 0;
        int countEven = 0;
        for(int i=0; i < numbers.length ;i++ ){
            if(numbers[i]%2 == 0){
                countEven++ ;  // ++countEven;
                sumEven += numbers[i]; // sumEven = sumEven + numbers[i]
            }
        }
        System.out.println("countEven = " + countEven);
        System.out.println("sumEven = " + sumEven);
//        sum of odd numbers in the array
        int sumOdd = 0;
        int countOfOdd = 0;
        for(int i=0; i < numbers.length ;i++){
            if(numbers[i]%2 != 0){
                   countOfOdd++ ;
                  sumOdd += numbers[i];
            }
        }
        System.out.println("countOfOdd = " + countOfOdd);
        System.out.println("sumOdd = " + sumOdd);
//        max number in the array
//        min number in the array


    }
}


