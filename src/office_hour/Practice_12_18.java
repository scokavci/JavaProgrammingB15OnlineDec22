package office_hour;

import java.util.Arrays;

public class Practice_12_18 {
    public static void main(String[] args) {

        String employee = "Philipia Salthouse [Electrical Engineer] psalthouse@g.co" ;
        //task: find out job title from this String : Electrical Engineer

        // logic : title is in between [ and ]  so we need to find index of [ and ]
        // and use substring(right after index of [   ,  index of ]    )


        int startingIndex = employee.indexOf("[") + 1;
        int endingIndex = employee.indexOf("]") ;
        String title = employee.substring(startingIndex,endingIndex);
        System.out.println("title = " + title);

        String fullName = employee.substring(0, employee.indexOf(" ["));
        System.out.println("fullName = " + fullName);

        // Philipia-Salthouse Electrical engineer
        String fullNameWithDash = fullName.replace(" ","-");
        System.out.println(fullNameWithDash +" "+ title);

        //TASK 3. Look for those 2 people in the array and assert below data
        /*
        Tracy Bartle should be Geological Engineer
        Skipper Abrahamsson should be Financial Advisor
        if true{
            Print "PASS: Verification successful. Tracy Bartle's job is Geological Engineer
        }else{
            Print "FAIL: Verification error:  Tracy Bartle's job is NOT Geological Engineer
        }
        */
         if(title.equals("Electrical Engineer")){
             System.out.println("PASS: Verification successful");
         }else{
             System.out.println("FAIL: Verification error"+ title);
         }

         // Bruce D Wayne
        // last index of Space
        System.out.println(  fullName.charAt(0)+ ""+ fullName.charAt(fullName.lastIndexOf(" ") +1)
                             + "-> "+ title );

    }
}
