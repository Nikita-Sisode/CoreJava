/*Implement a program that calculates the Body Mass Index (BMI) based on height and weight 
input using if-else to classify the BMI int categories (underweight, normal weight, overweight, 
etc. */

import java.util.Scanner;
class BMI{
    public static void main(String arg[])
    {
        Scanner sc =new Scanner (System.in);
        System.out.print("Take Input:");
        System.out.print("Height:");
        float h = sc.nextFloat();
        System.out.print("Weight:");
        float w = sc.nextFloat();
        System.out.print("BMI :");
        float BMI = w/(h*h)*10000;  //fORMULA BMI
        System.out.println(BMI);

        if(BMI >= 18 && BMI <=25){
            System.out.println("Normal Weight:");
        }
        else if (BMI<18){
        System.out.println("Under Weight:");
    
    }
    else if (BMI >=25 && BMI <= 30 ){
        System.out.println("Over Weight:");
    }
    else{
        System.out.println("INVALID INPUT ");
    }

    }
}