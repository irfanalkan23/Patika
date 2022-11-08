package pratik.loopsPractice6;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz
        int temp;
        int numberOfDigits;
        int digitValue;
        int digitPower;
        int result;

        System.out.println("1-999 arasındaki Armstrong sayılar : ");

        //1-999 arasındaki Armstrong sayıları buluyoruz
        for (int i = 1; i <= 999; i++) {
            temp = i;
            numberOfDigits = 0;
            result = 0;

            //Basamak sayısını buluyoruz
            while (temp != 0){
                temp /= 10;
                numberOfDigits++;
            }

            //Her bir basamak değerini basamak sayısı kadar kendisi ile çarpıyoruz
            temp = i;
            while (temp != 0){
                digitValue = temp % 10;
                digitPower = 1;
                for (int j = 1; j <= numberOfDigits; j++) {
                    digitPower *= digitValue;
                }
                result += digitPower;
                temp /= 10;
            }

            //Eğer sayı Armstrong ise yazdırıyoruz
            if (i == result){
                System.out.println(result);
            }
        }
    }
}
