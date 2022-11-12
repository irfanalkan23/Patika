package odev.mukemmelSayi;

import java.util.Scanner;

public class MukemmelSayi {

    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz
        int number;
        int sum = 0;

        //Kullanıcıdan bir sayı girmesini istiyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        //Eğer girilen sayı negatif bir sayı ise hata mesajı verip tekrar sayı girmesini istiyoruz
        while (number < 0){
            System.out.print("Lütfen pozitif tamsayı giriniz : ");
            number = input.nextInt();
        }

        //Girilen sayının çarpanlarını bulup topluyoruz
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0){
                sum += i;
            }
        }

        //Eğer çarpanları toplamı girilen sayıya eşit ise Mükemmel sayıdır
        if (sum == number){
            System.out.println(number + " Mükemmel sayıdır");
        } else {
            System.out.println(number + " Mükemmel sayı değildir.");
        }

        input.close();
    }
}
