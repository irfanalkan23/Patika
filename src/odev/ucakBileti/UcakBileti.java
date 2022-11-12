package odev.ucakBileti;

import java.util.Scanner;

public class UcakBileti {

    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz
        int distance,age,travelType;
        double basePrice;
        double ageDiscount = 0;
        double priceWithDiscount;
        double twoWayDiscount = 0;
        double totalPrice;

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan girdileri alıyoruz
        System.out.print("Mesafeyi km türünden giriniz : ");
        distance = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        travelType = input.nextInt();

        //Kullanıcıdan alınan değerlerin geçerli olduğunu kontrol ediyoruz:
        //Mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2.
        if (distance > 0 && age > 0 && (travelType == 1 || travelType == 2)) {

            //Normal tutarı hesaplıyoruz
            basePrice = distance * 0.10;

            //Yaş indirimini hesaplıyoruz
            if (age <= 12){
                ageDiscount = basePrice * 0.50;
            } else if (age <= 24){
                ageDiscount = basePrice * 0.10;
            } else if (age >= 65){
                ageDiscount = basePrice * 0.30;
            }

            //Yaş indirimini uyguluyoruz
            priceWithDiscount = basePrice - ageDiscount;

            //Yolculut tipi gidiş dönüş seçilirse bilet fiyatı üzerinden %20 indirim uyguluyoruz
            if (travelType == 2){
                twoWayDiscount = priceWithDiscount * 0.20;
                totalPrice = (priceWithDiscount - twoWayDiscount) * 2;

            //Yolculuk tipi 1 ve 2 haricinde olup olmadığı yukarıda kontrol edilmişti
            //Yolculuk tipi 1 ise indirim uygulamıyoruz
            } else {
                totalPrice = priceWithDiscount;
            }

            System.out.println("Toplam Tutar = " + totalPrice);

        //Geçersiz değer girildiğinde hata mesajı yazdırıyoruz
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }

        input.close();
    }
}
