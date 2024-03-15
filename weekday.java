/*Write a program that takes a number representing a weekday (1-7) and prints the name of the 
weekday using switch-case.*/

import java.util.Scanner;  //import java.util package to read input from user

class weekday {
  public static void main(String[] args) {   //main method
    Scanner Sc = new Scanner(System.in);   //scanner class to read input from user
    int Day = 0;

    System.out.println("Enter weekday number (0-7): ");
    Day = Sc.nextInt();

    switch (Day) {      //using switch case method print weekdays
    case 0:
      System.out.println("Sunday");
      break;

    case 1:
      System.out.println("Monday");
      break;

    case 2:
      System.out.println("Tuesday");
      break;

    case 3:
      System.out.println("Wednesday");
      break;

    case 4:
      System.out.println("Thursday");
      break;

    case 5:
      System.out.println("Friday");
      break;

    case 6:
      System.out.println("Saturday");
      break;

    default:
      System.out.println("Invalid weekday number:");
    }
    }
    
}