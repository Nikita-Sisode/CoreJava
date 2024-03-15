/*Write a program that takes a character as input and determines whether it’s a vowel or a 
consonant using if-else. */

//vowels:==> a e i o u
//consonant :==>other character than vowels

import java.util.Scanner;   //import scanner class in java.util package
class vowels{
    public static void main(String []arg){
        char ch;    //input character in variable ch
        System.out.print("Enter Character: ");
        Scanner r =new Scanner (System.in);  //scanner class object 
        ch=r.next().charAt(0);  //input charAt method //scanner object class method next()

        //using if else find character vowels or constant using OR operator
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            System.out.print("Vowels: ");
        }
        else{
            System.out.print("Consonant: ");
        }
    }
}