package pratik;

import java.util.Scanner;

public class VucutKitleHesaplama {

    //https://app.patika.dev/courses/java101/odev-vucut-kitle-hesaplama

    public static void main(String[] args) {
        int kilo;
        double boy;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo = input.nextInt();

        double indeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + indeks);
    }
}
/*
Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)

Çıktısı
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173
 */