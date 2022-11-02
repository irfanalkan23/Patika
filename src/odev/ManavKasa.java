package odev;

import java.util.Scanner;

public class ManavKasa {

    /**
     * Ödev linki: https://app.patika.dev/courses/java101/odev-manav-kasa
     * Kullanıcının manavdan almış olduğu ürünlerin kilogram değerlerine göre toplam tutarı ekrana yazdırır.
     */

    public static void main(String[] args) {

        int armut,elma,domates,muz,patlican;
        double armutFiyat=2.14,
                elmaFiyat=3.67,
                domatesFiyat=1.11,
                muzFiyat=0.95,
                patlicanFiyat=5.00;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? :");
        armut = input.nextInt();

        System.out.print("Elma Kaç Kilo ? :");
        elma = input.nextInt();

        System.out.print("Domates Kaç Kilo ? :");
        domates = input.nextInt();

        System.out.print("Muz Kaç Kilo ? :");
        muz = input.nextInt();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlican = input.nextInt();

        double toplamTutar = armut*armutFiyat + elma*elmaFiyat + domates*domatesFiyat
                + muz*muzFiyat + patlican*patlicanFiyat;

        System.out.println("Toplam Tutar : " + toplamTutar);
    }
}
/*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL

Örnek Çıktı;

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL
 */