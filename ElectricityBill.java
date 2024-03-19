import java.util.Scanner;

public class ElectricityBill{
 

    private static String used;
    private static String amount;

    public double cal(int u) {                //using else-if condition units consumed per charge
        int amt = 0;        
        if (u <= 100) {                      //first time consumed 100 units rs 5 per unit
            amt = 5 * u;
        }
        else if (u <= 200) {                     //next time consumed 200 units 7 rs per unit 
            amt = 5 * 100 + (u - 100) * 7;
        }
        else {                                             // units: Rs. 10 per units
            amt = 5 * 100 + 7* 100 + (u - 200) * 10;    
        }
        return amt;
    }
    
    public static void main(String args[]) {
        ElectricityBill obj = new ElectricityBill();                     
        Scanner in = new Scanner(System.in);
        System.out.println("Enter customer Name: ");     //print name/unit consumed /bill amount
        String name = in.nextLine();
        System.out.println("Enter Units Consumed: ");
        double units = in.nextDouble();
        System.out.println("Enter Bill Amount: ");
        double bill = in.nextDouble();

        System.out.println("Name :"+ name);
       
        System.out.println("Units:"+ units);
        
        System.out.println("Bill Amount:"+ bill);
       
        
    }
}