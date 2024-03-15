/* Create a program that demonstrates narrowing conversion from double to int and prints the result. */

class conversion2 {
    public static void main(String args[])   //Main method
    {
        double data = 65.6345;   //created double variable data and value assigned
        System.out.println("Double Value : " + data);   //double value print
        
        int value = (int)data;  //convert double to integer value
        System.out.println("Integer Value: " + value);    //print the converted double value into int value
    }
}