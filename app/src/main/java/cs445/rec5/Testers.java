package cs445.rec5;

import java.util.Arrays;

public class Testers {

    public static void main(String[] args){

        // RECURSION
        System.out.println("\n----------------------");
        System.out.println("Using Recursion");
        System.out.println("----------------------");
        // Test reverse() for an integer array of even length (10)
        Integer[] intArray = new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Before reversing: " + Arrays.toString(intArray));
        Recursion.reverse(intArray);
        System.out.println("After reversing: " + Arrays.toString(intArray));

        // Test reverse() for a double array of odd length (7)
        Double[] doubleArray = new Double[] {1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0};
        System.out.println("\nBefore reversing: " + Arrays.toString(doubleArray));
        Recursion.reverse(doubleArray);
        System.out.println("After reversing: " + Arrays.toString(doubleArray));

        // Test MinMax()
        int[] minMaxTest = {0,5,2,5,7,8,6,-1,44,2,5667,95,43,22,3527,-634,7543};
        Recursion.MinMax result_rec = Recursion.findMinMax(minMaxTest);
        System.out.println("\nExpected:\n\tMin: -634\tMax: 7543");
        System.out.println("Found:\n\t" + result_rec);
        System.out.println("----------------------");

        // DIVIDE & CONQUER
        System.out.println("Using Divide & Conquer");
        System.out.println("----------------------");
        // Test reverse() for an integer array
        Integer[] intArray_2 = new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Before reversing: " + Arrays.toString(intArray_2));
        DivideAndConquer.reverse(intArray_2);
        System.out.println("After reversing: " + Arrays.toString(intArray_2));

        // Test reverse() for a double array
        Double[] doubleArray_2 = new Double[] {1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0};
        System.out.println("\nBefore reversing: " + Arrays.toString(doubleArray_2));
        DivideAndConquer.reverse(doubleArray_2);
        System.out.println("After reversing: " + Arrays.toString(doubleArray_2));

        // Test MinMax()
        int[] minMaxTest_2 = {0,5,2,5,7,8,6,-1,44,2,5667,95,43,22,3527,-634,7543};
        DivideAndConquer.MinMax result_dc = DivideAndConquer.findMinMax(minMaxTest_2);
        System.out.println("\nExpected:\n\tMin: -634\tMax: 7543");
        System.out.println("Found:\n\t" + result_dc);
        System.out.println("----------------------\n");

    }

}

