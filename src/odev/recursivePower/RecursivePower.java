package odev.recursivePower;

import java.util.Scanner;

public class RecursivePower {

    public static void main(String[] args) {

        //Kullanıcıdan üslü sayının taban ve üs değerlerini alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.println("Üslü Sayı Hesaplama Programına Hoşgeldiniz!");
        System.out.print("Taban değeri giriniz : ");
        int base = input.nextInt();
        System.out.print("Üs değeri giriniz : ");
        int exponent = input.nextInt();

        //power() recursive metodunu çağırarak üslü sayının sonucunu hesaplıyoruz ve yazdırıyoruz
        int result = power(base, exponent);
        System.out.println(base + " ^ " + exponent + " = " + result);
    }

    //Üslü sayıyı hesaplayan recursive metod
    static int power(int base, int exponent){

        //'exponent' değeri '0' değilken recursive olarak üslü sayı hesaplansın
        if (exponent != 0){
            return base * power(base, exponent-1);

        //'exponent' değeri '0' olduğunda power() metodu recursive çalışmasını durdursun
        } else {

            //'exponent' değeri '0' olduğunda '1' değerini geri döndürsün (return 1) ve böylece power() metodu tekrar kendisini çağırmasın.
            return 1;
        }
    }
}
