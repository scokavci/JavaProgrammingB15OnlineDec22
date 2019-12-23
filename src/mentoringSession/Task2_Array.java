package mentoringSession;

public class Task2_Array {
    public static void main(String[] args) {
                 //                0         1        2          3              4          5
        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
//        Do below tasks :
//        1.0 loop through each grocery items and print them in One line
          for(int i=0; i < groceryItems.length;i++ ){
              System.out.print(groceryItems[i]+ " ");
          }
        System.out.println();
//        1.1 print each items at odd index
          for(int i=0; i < groceryItems.length; i++){
               if(i%2 !=0){  // i%2 == 1
                   System.out.println(groceryItems[i] + " ");
               }
          }
//        1.2 print all items in reverse order
        for(int i = groceryItems.length-1; i >=0;i--){
            System.out.print(groceryItems[i]+ " ");
        }
        System.out.println();
//        1.3 find out the index location of strawberry
          for(int i=0;i < groceryItems.length;i++){
              if(groceryItems[i].equals("strawberry")){
                  System.out.println("i = " + i);
              }
          }
//        1.4 find out the count of groceries that contains berry in the name
        int countOfBerry = 0;
        for(int i=0; i < groceryItems.length;i++ ){
            if(groceryItems[i].contains("berry")){
                countOfBerry++;
            }
        }
        System.out.println("countOfBerry = " + countOfBerry);
//        1.5 print out all the character counts of the grocery items
//        1.6 print out only those items with even character count
//        1.7 print out only those items end with letter e
//        1.8 print out only last 3 characters of all the items
//        1.9 create String variable called allItems and store all the items inside array separated by comma.


    }
}