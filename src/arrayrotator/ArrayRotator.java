/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayrotator;

import static java.lang.Math.abs;
import static java.lang.Math.floor;

/**
 *
 * @author Lucio Guechi
 */
public class ArrayRotator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {1, 2, 3, 4, 5, 6};

        System.out.println("Array Original: ");
        for (int x = 0; x <= a.length - 1; x++) {
            System.out.print(a[x]);
        }
         System.out.println("");
        //arrayRot Method:
        arrayRot(a, -50);

        System.out.println("\nArray Rotated: ");
        for (int x = 0; x <= a.length - 1; x++) {
            System.out.print(a[x]);
        }
    }

    /*Write a function that takes an array of integers and returns 
     //that array rotated by N positions.
     //For example, if N=2, given the input array [1, 2, 3, 4, 5, 6] 
     the function should return [5, 6, 1, 2, 3, 4] */
    public static void arrayRot(int[] arraySource, int position) {
        int startIndex = 0;
        int rotatedArraySize = arraySource.length;
        int[] arrayRotated = new int[rotatedArraySize];

        //Check if position fits array boundaries if not, rewrite position.
        if (position > arraySource.length) {
            position = position - (position / arraySource.length) * arraySource.length;
        } else if (position < -arraySource.length) {
            position = position - (position / arraySource.length) * arraySource.length;
        }

        //Check if startIndex for Rotation need adjustment
        if ((position > 0) && (position  <= arraySource.length)) {
            startIndex = position;
        } else if ((position < 0) && (position >= -arraySource.length)) {
            startIndex = arraySource.length + position;
             System.out.println("si" + position);
        }

        //Copy First Items of the Rotated Array  
        System.arraycopy(arraySource, arraySource.length - startIndex, arrayRotated, 0, startIndex);
        //Copy Rest of the Array 
        System.arraycopy(arraySource, 0, arrayRotated, startIndex, arraySource.length - startIndex);
        //Replace original array array with rotated Array
        System.arraycopy(arrayRotated, 0, arraySource, 0, arrayRotated.length);
    }
}
