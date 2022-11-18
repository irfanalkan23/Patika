package odev.matrisTranspoz;

import java.util.Arrays;

public class ArrayTranspose {

    public static void main(String[] args) {

        //2 boyutlu matrisi tanımlıyoruz
        int[][] array = { {1,2,3}, {4,5,6}};

        System.out.println("Matris :");

        //Tanımladığımız matrisi yazdırıyoruz
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        //Matrisin transpozunu 'transpose()' metodu ile bulup 'result' adıyla yeni bir matrise atıyoruz
        int[][] result = transpose(array);

        System.out.println("Transpose :");

        //Transpoz matrisi yazdırıyoruz
        for (int[] ints : result) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }

    /**
     * Verilen 2 boyutlu bir matrisin transpozunu bulup geri dönduren metot
     * @param arr
     * @return
     */
    public static int[][] transpose(int[][] arr){
        int[][] transposedArray = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                transposedArray[i1][i] = arr[i][i1];
            }
        }
        return transposedArray;
    }
}
