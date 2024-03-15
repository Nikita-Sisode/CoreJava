/*Write a program that demonstrates widening conversion from int to double and prints the result */
public class conversion {
    public static void main(String[] args) {
        int i = 86;    //covert integer value into double
        double d = i; // Using assignment operator to convert int to double

        System.out.println("Original int value: " + i);
        System.out.println("Converted double value: " + d);
    }
}