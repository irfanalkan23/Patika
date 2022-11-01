package pratik;

import java.util.Scanner;

public class DaireAlanCevre {

    // https://app.patika.dev/courses/java101/pratik-daire-alan-cevre

    public static void main(String[] args) {
        int r, a;           // "r" : dairenin yarıçapı. "a" : daire diliminin açısı
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz : ");
        r = input.nextInt();
        System.out.println("Daire diliminin açısını giriniz : ");
        a = input.nextInt();

        double area = pi * r * r;
        double perimeter = 2 * pi * r;
        double sliceArea = (pi * r * r * a) / 360;

        System.out.println("Dairenin alanı : " + area);
        System.out.println("Dairenin çevresi : " + perimeter);
        System.out.println("Daire diliminin alanı : " + sliceArea);
    }
}
/*
Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
 */