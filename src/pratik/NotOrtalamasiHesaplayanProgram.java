package pratik;

import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {
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
