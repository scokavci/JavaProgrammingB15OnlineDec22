package day27;

public class MultiDimensionArrayString {
    public static void main(String[] args) {
        String[] developersTeam = {" Vladis","Hasan","Tolkun","Abide"};
        String[] testerTeam = {"Zhibekchach", "Mohammed Sohrabi", "Nursultan"};
        String[] businessAnalysisTeam = {"Lisa","Ershad","Naila"};

        String[][] scrumTeam = {developersTeam , testerTeam, businessAnalysisTeam};
        // find the longestname

        int maxLength = scrumTeam[0][0].length();
        String longestString = "";  // to store the longest string

        for(String[] each1DArray : scrumTeam){
            for(String eachElement : each1DArray){
                if(maxLength < eachElement.length()){ // tocompare which string has longest length
                    maxLength = eachElement.length();
                    longestString = eachElement;
                }
            }
        }
        System.out.println(longestString);
    }
}
