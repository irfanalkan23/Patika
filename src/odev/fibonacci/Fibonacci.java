package odev.fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        /*
        Örneğin; 10 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
         */

        //Değişken tanımlıyoruz
        int n;          //Fibonacci serisi eleman sayısı
        int first = 0;  //Toplama işlemi ilk eleman
        int second = 1; //Toplama işlemi ikinci eleman
        int sum;        //Toplam

        //Kullanıcıdan Fibonacci serisi için eleman sayısını alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisi için eleman sayısını girin : ");
        n = input.nextInt();

        //Fibonacci serisinin ilk iki elemanı '0' ve '1' olduğu için önce bunları yazdırıyoruz
        System.out.print(n + " Elemanlı Fibonacci Serisi : 0 1 ");

        //Fibonacci serisinin sayılarını yazdırıyoruz.
        //İlk ikisi yukarıda yazdırıldığından 'n-2' adet yazdırıyoruz
        for (int i = 1; i <= n-2; i++) {
            sum = first + second;
            System.out.print(sum + " ");
            first = second;
            second = sum;
        }

        input.close();
    }
}
