package odev.recursivePower;

import java.util.Scanner;

public class RecursivePower {

    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz
        int base, exponent, result;

        //Kullanıcıdan üslü sayının taban ve üs değerlerini alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        base = input.nextInt();
        System.out.print("Üs değerini giriniz : ");
        exponent = input.nextInt();

        //Üs değeri (exponent) negatif sayı girilirse kullanıcıdan tekrar alıyoruz
        while (exponent < 0) {
            System.out.print("Üs değerini pozitif tamsayı giriniz : ");
            exponent = input.nextInt();
        }

        //power() recursive metodunu çağırarak üslü sayının sonucunu hesaplıyoruz ve yazdırıyoruz
        result = power(base, exponent);
        System.out.println(base + " ^ " + exponent + " = " + result);

        input.close();
    }

    //Üslü sayıyı hesaplayan recursive metod
    static int power(int base, int exponent) {

        //'exponent' değeri '0' değilken recursive olarak üslü sayı hesaplansın
        if (exponent != 0) {
            return base * power(base, exponent - 1);

            //'exponent' değeri '0' olduğunda power() metodu recursive çalışmasını durdursun
        } else {

            //'exponent' değeri '0' olduğunda '1' değerini geri döndürsün (return 1) ve böylece power() metodu tekrar kendisini çağırmasın.
            return 1;
        }

    }
}
