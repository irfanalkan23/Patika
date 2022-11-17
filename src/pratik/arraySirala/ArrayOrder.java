package pratik.arraySirala;

import java.util.Scanner;

public class ArrayOrder {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Dizinin boyutu n : ");
        int n = input.nextInt();

        System.out.println("Dizinin elemanlarını giriniz : ");
        //Dizinin elemanlarını getElements() motodu ile alıyoruz
        int[] array = getElements(n);

        //Diziyi sortElements() metodu ile sıralayıp printArray() metodu ile yazdırıyoruz
        printArray(sortElements(array));
    }

    /**
     * Dizinin elemanlarını kullanıcıdan alır
     * @param capacity eleman sayısı
     * @return int[] array döndürür
     */
    public static int[] getElements(int capacity){
        int[] values = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            System.out.print(i+1 +". Elemanı : ");
            values[i] = input.nextInt();
        }
        return values;
    }

    /**
     * Verilen bir diziyi küçükten büyüğe sıralar
     * @param array
     * @return int[] array döndürür
     */
    public  static int[] sortElements(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    /**
     * Verilen bir array'i yazdırır
     * @param array
     */
    public static void printArray(int[] array) {
        System.out.print("Sıralama : ");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

}
