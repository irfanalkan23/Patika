package pratik.arrayDuplicates;

import java.util.Arrays;

public class ArrayDuplicates {

    public static void main(String[] args) {

        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 10, 2};

        //Dizideki tekrar eden çift sayıları içerecek olan boş bir dizi oluşturuyoruz
        int[] duplicateEven = new int[0];

        System.out.print("Dizideki tekrar eden çift sayılar : ");

        //Dizideki elemanları döngü ile kontrol edip tekrar eden çift sayıları 'duplicateEven' dizisine ekler
        for (int i = 0; i < list.length; i++) {
            int element = list[i];
            for (int j = i + 1; j < list.length; j++) {
                if (element % 2 == 0) {
                    if (element == list[j]) {
                        if (!isDuplicate(duplicateEven, element)) {
                            duplicateEven = addElement(duplicateEven, element);
                        }
                    }
                }
            }
        }

        //Tekrar eden çift sayıları içeren 'duplicateEven' dizisini yazdırır
        for (int i : duplicateEven) {
            System.out.print(i + " ");
        }

        //'duplicateEven' dizisi boş ise mesaj ile kullanıcıya bildirir
        if (duplicateEven.length == 0) {
            System.out.println("-\nTekrar eden çift sayı bulunmamaktadır!");
        }

    }

    /**
     * Verilen diziye, verilen elemanı ilave eder ve yeni diziyi geri döndürür
     * @param array verilen elemanın ilave edileceği dizi
     * @param element ilave edilecek eleman
     * @return int[]
     */
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    /**
     * Verilen dizide, verilen elemanın mevcut olup olmadığını kontrol eder
     * @param array
     * @param element
     * @return boolean: verilen eleman dizide mevcut ise true, değilse false döner
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
}
