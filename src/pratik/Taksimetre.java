package pratik;

import java.util.Scanner;

public class Taksimetre {

    // https://app.patika.dev/courses/java101/pratik-taksimetre

    public static void main(String[] args) {

        int distance;
        double total;

        Scanner input = new Scanner(System.in);
        System.out.println("Gidilen mesafeyi giriniz (km) : ");
        distance = input.nextInt();

        total = 10 + (distance * 2.20);
        total = (total < 20) ? 20 : total;
        System.out.println("Tutar = " + total);
    }
}
/*
Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
 */