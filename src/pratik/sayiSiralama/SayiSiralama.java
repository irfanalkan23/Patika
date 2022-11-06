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
                min=1; mid=2; max=3;
            } else {
                min=1; mid=3; max=2;
            }
        } else if (num2 < num3){
            if (num1 < num3){
                min=2; mid=1; max=3;
            } else {
                min=2; mid=3; max=1;
            }
        } else {
            if (num2 < num1){
                min=3; mid=2; max=1;
            } else {
                min=3; mid=1; max=2;
            }
        }

        //Sıralamayı küçükten büyüğe yazdırıyoruz
        System.out.println(min +". sayı < " + mid + ". sayı < " + max + ". sayı");

        //Scanner object'ini kapatıyoruz
        input.close();
    }
}
