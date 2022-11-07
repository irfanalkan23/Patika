package odev.ucakBileti;

import java.util.Scanner;

public class UcakBileti {

    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz
        int distance,age,travelType;
        double basePrice;
        double ageDiscount = 0;
        double priceWithDiscount = 0;
        double twoWayDiscount = 0;
        double totalPrice = 0;

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan girdileri alıyoruz
        System.out.print("Mesafeyi km türünden giriniz : ");
        distance = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        travelType = input.nextInt();

        //Toplam tutarı hesaplıyoruz
        if (distance > 0 && age > 0 && (travelType == 1 || travelType == 2)) {
            basePrice = distance * 0.10;

            if (age <= 12){
                ageDiscount = basePrice * 0.50;
            } else if (age <= 24){
                ageDiscount = basePrice * 0.10;
            } else if (age >= 65){
                ageDiscount = basePrice * 0.30;
            }

            priceWithDiscount = basePrice - ageDiscount;

            if (travelType == 2){
                twoWayDiscount = priceWithDiscount * 0.20;
                totalPrice = (priceWithDiscount - twoWayDiscount) * 2;
            } else {
                totalPrice = priceWithDiscount - twoWayDiscount;
            }

            System.out.println("Toplam Tutar = " + totalPrice);

        //Geçersiz değer girildiğinde hata mesajı yazdırıyoruz
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }

        input.close();
    }
}
