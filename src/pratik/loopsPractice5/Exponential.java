package pratik.loopsPractice5;

import java.util.Scanner;

public class Exponential {

    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz
        int base, exponent;
        double result = 1.0;

        //Kullanıcıdan girdileri alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz : ");
        base = input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz : ");
        exponent = input.nextInt();

        //Üslü sayıyı hesaplıyoruz
        //Eğer üs değeri pozitif sayı ise:
        if (exponent > 0 ){
            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }
        //Eğer üs değeri negatif sayı ise:
        } else {
            for (int i = -1; i >= exponent; i--) {
                result *= (1.0 / base);
            }
        }

        //Sonucu yazdırıyoruz
        System.out.println(base + "^" + exponent + " = " + result);

        input.close();
    }
}
