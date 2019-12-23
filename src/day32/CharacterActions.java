package day32;

public class CharacterActions {
    public static void main(String[] args) {
      printAToZ();
      printZToA();
      printAlphabetInRange('a', 'f');
      printAlphabetInRange('G', 'B');
      printAlphabetInRange('D', 'A');
      printAlphabetInRange('Z', 'a');

    }
//    printAtoZ
//    create a method that has no parameter
//    and print A-Z in one line
    // this is how we print in descending order
    public static void printAToZ(){
        for(char iChar = 'A'; iChar <= 'Z'; iChar++){
            System.out.print(iChar+" ");
        }
        System.out.println(); // so we can move to next line
    }
    //    printZtoA
//    create a method that has no parameter
//    and print Z-A in one line
    public static void printZToA(){
        for (char iChar = 'Z'; iChar >='A' ; iChar--) {
            System.out.print(iChar+" ");
        }
        System.out.println();
    }
//    printAlphabetInRange
//* create a method that have 2 char as parameters: beginning, ending
//if beginning character is before ending character
//	for example beginning A , ending D  -->> ABCD
//if beginning character is after ending character
//	for example beginning D , ending A  -->> DCBA
    public static void printAlphabetInRange(char beginning , char ending){

            if (beginning < ending) {
                System.out.println(" WE NEED TO INCREMENT FROM " + beginning + " till " + ending);
                for (char iChar = beginning; iChar <= ending; iChar++) {
                    System.out.print(iChar+" ");
                }
                System.out.println();
            } else if (beginning > ending) {
                System.out.println(" WE NEED TO DECREEMENT FROM " + beginning + " till " + ending);
                for (char iChar = beginning; iChar >= ending; iChar--) {
                    System.out.print(iChar+" ");
                }
                System.out.println();
            } else {
                System.out.println("they are same character");
            }
        }
    }

