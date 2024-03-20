/*Using Predefine Method:Write a Java program to check the equality of two arrays?*/

import java.util.Arrays;

public class ArrayEqual{
    public static void main(String[] args) {
        
    
    int arr1[]={1,2,3,4,5};           //initialize the Array
    int arr2[]={1,2,3,4,5};
    int arr3[]={1,2,3,4,5,3};
    int arr4[]={1,2,3,4,5,7,8};


    boolean r1 = Arrays.equals(arr1,arr2);  //method Araays.equals() use to check arrays equal or not
    boolean r2 = Arrays.equals(arr3,arr4);   
                 
    if (r1 || r2 == true ) {                           //condition to check result
    System.out.println("Array 1& 2 are Equal: " +r1);       //print result
   }
                
   if (r1 || r2  == false ) {                           //condition to check result
    System.out.println("Array 3 & 4 are not Equal:" +r2);       //print result
   }
   
   else{
    
   }

}
}
