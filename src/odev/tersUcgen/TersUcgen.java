package odev.tersUcgen;

import java.util.Scanner;

public class TersUcgen {

    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz
        int n;      //Basamak sayısı

        //Kullanıcıdan ters üçgenin basamak sayısını girmesini istiyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Ters üçgen çizdirmek için basamak sayısını giriniz : ");
        n = input.nextInt();

        //Her satırda boşlukları ve yıldızları yazdıran döngü
        for (int i = 1; i <= n; i++) {
            // Her satırdaki boşluğu yazdırıyoruz
            for (int j = 0; j < i-1; j++) {
                System.out.print(" ");
            }
            //Her satırdaki yıldızı yazdırıyoruz
            for (int j = (2*n - 2*i + 1); j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

        input.close();
    }
}
