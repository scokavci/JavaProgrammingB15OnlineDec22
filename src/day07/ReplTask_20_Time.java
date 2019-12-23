package day07;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ReplTask_20_Time {
     public static void main(String[] args) {

     int hour, minute, second;
     String amOrPm;

     Scanner input = new Scanner(System.in);
     hour = input.nextInt();
     minute = input.nextInt();
     second = input.nextInt();
     amOrPm = input.next();

     System.out.println(hour+":"+minute+":"+second+":"+amOrPm);
  }
}
