import java.util.Scanner;

public class BMI_calculator{
    private double weight ;                  //declare variable
    private double height;
    public double getWeight() {       //get-set method
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
     public static void main(String[] args) {               //main method
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Weight in kilograms:");             
        double weight = input.nextDouble();                            //scanner method

        System.out.println("Enter height in meters:");
        double height = input.nextDouble();
          
        System.out.println(weight);
        System.out.println(height);

         double bmi = weight / (height * height);        //formula: BMI = weight / (height * height)
         System.out.println("Your BMI is:"+ bmi);
        
    
}
        
    }
    