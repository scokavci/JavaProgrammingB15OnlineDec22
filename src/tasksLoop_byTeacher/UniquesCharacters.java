package tasksLoop_byTeacher;

public class UniquesCharacters {

    public static void main(String[] args) {

//        Find Unique characters in a String :
//        aaaabbbbbcccaabbcd --->> abcd
//        go through each and every character and
//        check whether the current character is already
//        in uniques variable (uniques.contains(currentChar) )
//        if not concatenate it to unique variable
//        get out of the loop when you are done with last character
        String text = "aaaabbbbbcccaabbcd";
        String uniques = "";

        for (int i = 0; i <= text.length()-1; i++) {
            String  currentChar = text.substring(i, i+1);

            if( uniques.contains(currentChar)){
                continue;
            }else{
                uniques += currentChar ;
            }
        }
        System.out.println(uniques);

    }
}
