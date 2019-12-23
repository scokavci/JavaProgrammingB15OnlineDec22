package day26;

public class ToCharArrayPractice {

    public static void main(String[] args) {

        // 2 additional String methods related to array
        // 1. toCharArray() , 2. split(bysomething)
        String survey = "Complete B15 Online 1 Month Survey";

        char[] surveyChars = survey.toCharArray();
        // for loop just to see what is inside
        for(char each : surveyChars){
            System.out.println("each char is : "+ each);
        }

        // just for fun let's do it

        int x = 0;
        while(  x < surveyChars.length){
            System.out.println("each char is : "+surveyChars[x]);
            x++ ;
        }

        for (int i = 0; i < surveyChars.length; i++) {
            System.out.println("each char is : "+surveyChars[i]);
        }

        int j = 0;
        do{
            System.out.println("each char is : "+surveyChars[j]);
            j++;
        }while( j < surveyChars.length);
    }
}
