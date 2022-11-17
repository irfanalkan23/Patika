package odev.arrayFrequency;

import java.util.Arrays;

public class ArrayFrequency {

    public static void main(String[] args) {

        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi : " + Arrays.toString(array));

        //Create a new array to store distinct elements of the array
        int[] distinctElements = new int[0];

        //Load the distinctElements array with distinct elements
        for (int i : array) {
            if (frequencyOfElement(array, i) == 1) {
                distinctElements = addElement(distinctElements, i);
            } else {
                if (!isDuplicate(distinctElements, i)) {
                    distinctElements = addElement(distinctElements, i);
                }
            }
        }

        //Print the output as requested in the task description
        System.out.println("Tekrar Sayıları");
        for (int each : distinctElements) {
            System.out.println(each + " sayısı " + frequencyOfElement(array, each) + " kere tekrar edildi.");
        }

    }

    /**
     * Returns the frequency of the given element from the given array
     * @param array
     * @param element
     * @return
     */
    public static int frequencyOfElement(int[] array, int element){
        int count = 0;
        for (int each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }

    /**
     * Checks whether the given element is duplicate in the array or not
     * @param array
     * @param element
     * @return boolean
     */
    public static boolean isDuplicate(int[] array, int element) {
        boolean duplicate = false;
        for (int i : array) {
            if (i == element) {
                duplicate = true;
                break;
            }
        }
        return duplicate;
    }

    /**
     * Adds the given element to the given array, and returns a new array
     * @param array
     * @param element
     * @return
     */
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length + 1];

        int i =0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;
        return result;
    }
}
