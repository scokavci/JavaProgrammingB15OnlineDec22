package day16;

public class StringPractice {

    public static void main(String[] args) {

    String keyWordSearch = "Java";
    String tabTitle = keyWordSearch+ " - Google Search";

    if( tabTitle.startsWith(keyWordSearch) && tabTitle.endsWith(" - Google Search")){
        System.out.println("Test Passed");
    }else {
        System.out.println("Test Failed");
    }


    }
}
