package pratik.arrayEnYakinSayi;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEnYakinSayi {

    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz
        int less;
        int greater;
        int closestLess = Integer.MIN_VALUE;
        int closestGreater = Integer.MAX_VALUE;

        //Diziyi tanımlıyoruz
        int[] list = {15,12,788,1,-1,-778,2,0};

        //Kullanıcıdan bir sayı girmesini istiyoruz
        Scanner input = new Scanner(System.in);
        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.print("Girilen Sayı : ");
        int n = input.nextInt();

        //Girilen sayıydan küçük en yakın sayıyı ve büyük en yakın sayıyı bulan döngü
        for (int i : list) {
            if (i < n) {
                less = i;
                if (less > closestLess){
                    closestLess = less;
                }
            }
            if (i > n) {
                greater = i;
                if (greater < closestGreater){
                    closestGreater = greater;
                }
            }
        }

        //Sonucu yazdırıyoruz
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + closestLess);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + closestGreater);

        input.close();
    }
}
