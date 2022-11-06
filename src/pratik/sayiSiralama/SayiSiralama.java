package pratik.sayiSiralama;

import java.util.Scanner;

public class SayiSiralama {

    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz
        int num1, num2, num3, min, mid, max;

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan sayıları alıyoruz
        System.out.print("1. sayıyı giriniz : ");
        num1 = input.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        num2 = input.nextInt();

        System.out.print("3. sayıyı giriniz : ");
        num3 = input.nextInt();

        //Sayıları karşılaştırıyoruz ve küçükten büyüğe sıralıyoruz
        if(num1 < num2 && num1 < num3){
            if (num2 < num3){
                min=num1; mid=num2; max=num3;
            } else {
                min=num1; mid=num3; max=num2;
            }
        } else if (num2 < num3){
            if (num1 < num3){
                min=num2; mid=num1; max=num3;
            } else {
                min=num2; mid=num3; max=num1;
            }
        } else {
            if (num2 < num1){
                min=num3; mid=num2; max=num1;
            } else {
                min=num3; mid=num1; max=num2;
            }
        }

        //Sıralamayı küçükten büyüğe yazdırıyoruz
        System.out.println(min + " < " + mid + " < " + max);

        //Scanner object'ini kapatıyoruz
        input.close();
    }
}
