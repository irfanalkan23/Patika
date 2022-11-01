package pratik;

import java.util.Scanner;

public class HipotenusBulma {

    //https://app.patika.dev/courses/java101/pratik-hipotenus-bulma

    public static void main(String[] args) {

        int a, b;
        double c;

        Scanner input = new Scanner(System.in);
        System.out.println("Dik üçgen 1. Kenarı Giriniz : ");
        a = input.nextInt();
        System.out.println("Dik üçgen 2. Kenarı Giriniz : ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs : " + c);

        System.out.println("-----------------------");

        //Üç kenar uzunluğunu kullanıcıdan alınan üçgenin alanını hesaplar:
        int d, e, f;        // üçgenin kenar uzunlukları
        double u, alan;     // "u" üçgenin alanının yarısı

        System.out.println("Üçgen 1. Kenarı Giriniz : ");
        d = input.nextInt();
        System.out.println("Üçgen 2. Kenarı Giriniz : ");
        e = input.nextInt();
        System.out.println("Üçgen 3. Kenarı Giriniz : ");
        f = input.nextInt();

        u = (a+b+c)/2;
        alan = Math.sqrt( u * (u-d) * (u-e) * (u-f) );
        System.out.println("Üçgenin alanı : " + alan);

    }
}
/*
Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
 */