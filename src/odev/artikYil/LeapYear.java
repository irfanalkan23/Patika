package odev.artikYil;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz
        int year;
        boolean isLeapYear=false;

        //Kullanıcıdan doğum yılı girdisini alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        year = input.nextInt();

        //Artık yıl olup olmadığını hesaplıyoruz
        if (year % 4 == 0){
            isLeapYear = true;
            if (year % 100 == 0){
                isLeapYear = year % 400 == 0;
            }
        }

        //Artık yıl olup olmadığını yazdırıyoruz
        if (isLeapYear){
            System.out.println(year + " bir artık yıldır !");
        } else {
            System.out.println(year + " bir artık yıl değildir !");
        }
    }
}
