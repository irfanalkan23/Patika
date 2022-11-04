package pratik.hesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz
        double number1, number2;
        int mathOperator;

        //Kullanıcı girdilerini alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        number1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz : ");
        number2 = input.nextDouble();

        //Kullanıcıdan matematik işlemi seçeneğini alıyoruz
        System.out.println("İşlem seçenekleri :\n\t1-Toplama\n\t2-Çıkarma\n\t3-Çarpma\n\t4-Bölme");
        System.out.print("Seçiminizi giriniz (1 / 2 / 3 / 4) : ");
        mathOperator = input.nextInt();

        //Kullanıcı girdileri doğrultusunda matematik işleminin sonucunu yazdırıyoruz
        switch (mathOperator){
            case 1:
                System.out.println("Toplama işlemi sonucu : " + (number1 + number2));
                break;
            case 2:
                System.out.println("Çıkarma işlemi sonucu : " + (number1 - number2));
                break;
            case 3:
                System.out.println("Çarpma işlemi sonucu : " + (number1 * number2));
                break;
            case 4:
                //Bölme işleminde bölen "0" olursa hata mesajı verdiriyoruz
                if(number2 != 0){
                    System.out.println("Bölme işlemi sonucu : " + (number1 / number2));
                } else {
                    System.out.println("Bir sayı 0'a bölünemez !");
                    System.out.println("Program sonlandı.");
                }
                break;
            // 1,2,3 veya 4 dışında bir seçim yapılırsa hata mesajı verdiriyoruz
            default:
                System.out.println("Geçersiz değer girdiniz : " + mathOperator);
                System.out.println("Program sonlandı.");
        }
    }
}
