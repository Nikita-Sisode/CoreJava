/*Write a program to reverse an Array in java .*/

import java.util.*;
import java.util.Collections;

public class ReverseArray {
    static void reverse (Integer a[])
    {
        Collections.reverse(Arrays.asList (a));    //using collection.reverse method
        System.out.println(Arrays.asList(a));
    }
    public static void main(String[] args) {
        Integer [] arr = {12,13,14,15,16};
        reverse (arr);
    }
}
