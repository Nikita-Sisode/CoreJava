/*Implement a simple calculator program that takes two numbers and an operator (+, -, *, /) as 
input and performs the operation using switch-case.  */

import java.util.Scanner; //program import java.util package
public class calculator {     //class define
public static void main(String[] args) {
double num1, num2;   //declare two variable in main method
char operator;       //declre variable to hold arithmatic operation
Scanner input = new Scanner(System.in);  //create scanner object to read input from user
System.out.print("Enter first number: "); //enter number store in num1 variable
num1 = input.nextDouble();    
System.out.print("Enter operator: ");  //enter arithmatic operation store in operator variable
operator = input.next().charAt(0);
System.out.print("Enter second number: "); //enter number store in num2 variable
num2 = input.nextDouble();
switch(operator) {           //using switch statement perform the arithmatic operation 
case '+':
System.out.println(num1 + num2);
break;
case '-':
System.out.println(num1 - num2);
break;
case '*':
System.out.println(num1*num2);
break;
case '/':
System.out.println(num1 / num2);
break;
default:
System.out.println("Invalid operator");
}
}
}