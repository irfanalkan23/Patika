package odev.minMax;

import java.util.Scanner;

public class minMax {

    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz
        int n;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        //Kullanıcıdan kaç adet sayı girileceği bilgisini alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = input.nextInt();

        //Girilen sayı kadar döngü ile kullanıcıdan karşılaştırılacak sayıları alıyoruz
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int number = input.nextInt();

            //En büyük ve en küçük sayıları buluyoruz
            if (number > max){
                max = number;
            }
            if (number < min){
                min = number;
            }
        }

        //Ek büyük ve en küçük sayıları ekrana yazdırıyoruz
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

        input.close();
    }
}
