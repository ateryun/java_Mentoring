package JAVAS_Mentoring;

import java.util.Scanner;

public class _1_4 {
    public static void main(String[] args) {
        float[] arr = {1.1f, 2.3f, 4.7f, 7.5f};
        double[] arr1 = new double[4];
        int[] arr2 = new int[4];

        System.out.printf("%d\n", arr.length);
        for ( int i =0; i<arr.length; i++) {
            System.out.printf("%f ",arr[i]);
        }
        System.out.printf("\n");

        for ( int j = 0; j <arr.length; j++){
            arr1[j] = arr[j];
        }
        for( int a = 0; a< arr.length; a++)
            System.out.printf("%f ", arr1[a]);
        for (int b = 0; b < arr.length; b++){
            arr2[b] = (int)arr1[b];
            }
        System.out.println("\n");
        for(int c = 0; c< arr.length; c++)
            System.out.printf("%d ", arr2[c]);
    }
}
