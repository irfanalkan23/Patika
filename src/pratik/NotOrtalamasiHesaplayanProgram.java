package pratik;

import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {
    //Link to course page: https://app.patika.dev/courses/java101/pratik-not-ortalamasi

    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz : ");
        mat = input.nextInt();

        System.out.println("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.println("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.println("Türkçe notunuz : ");
        turkce = input.nextInt();

        System.out.println("Tarih notunuz : ");
        tarih = input.nextInt();

        System.out.println("Müzik notunuz : ");
        muzik = input.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam/6;
        System.out.println("Ortalamanız : " + sonuc);

        String sinifGeçmeDurumu = sonuc >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sinifGeçmeDurumu);
    }
}
/**
 * Not Ortalaması Hesaplayan Program
 * Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
 *
 * Ödev
 * Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
 *
 * Not : If ve Else kullanılmayacak...
 *
 * @author irfan
 */