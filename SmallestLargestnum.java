/*Find out smallest and largest number in a given Array? */

public class SmallestLargestnum {
    public static void main(String[] args) {
        
        int num [] = new int []{12,13,43,56,32,53,65};

        int smallest = num[0];
        int largest = num[0];

        for  (int i =1; i < num.length; i++){
            if (num[i] > largest )
            largest = num [i];

            else if (num[i] < smallest)
            smallest = num [i];

        }
        System.out.println("Largest number is:" + largest);
        System.out.println("Smallest number is:" + smallest);

    }
}