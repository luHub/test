/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayrotator;

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
        
        //arrayRot Method:
        arrayRot(a, 2);
        
        System.out.println("\nArray Rotated: ");
        for (int x = 0; x <= a.length - 1; x++) {
            System.out.print(a[x]);
        }
    }

    /*Write a function that takes an array of integers and returns 
    //that array rotated by N positions.
    //For example, if N=2, given the input array [1, 2, 3, 4, 5, 6] 
    the function should return [5, 6, 1, 2, 3, 4] */
    public static void arrayRot(int[] arraySource ,int position){
    int startIndex = position;
    int rotatedArraySize=arraySource.length;
    int[] arrayRotated = new int[rotatedArraySize];
    System.arraycopy(arraySource, arraySource.length-startIndex, arrayRotated, 0, startIndex);
    System.arraycopy(arraySource,0,arrayRotated,startIndex,arraySource.length-startIndex);
    System.arraycopy(arrayRotated,0,arraySource,0,arrayRotated.length);
    }
}
