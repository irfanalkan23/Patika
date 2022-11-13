package odev.recursivePrime;

import java.util.Scanner;

public class RecursivePrime {

    public static void main(String[] args) {

        //Kullanıcıdan bir sayı alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int number = input.nextInt();

        //isPrime() metodunu çağırarak sayının asal olup olmadığını bulup yazdırıyoruz
        if (isPrime(number, 3)) {
            System.out.println(number + " sayısı ASALDIR !");
        } else {
            System.out.println(number + " sayısı ASAL değildir !");
        }

        input.close();
    }

    //Recursive olarak asal sayı bulan metod
    static boolean isPrime(int number, int i) {
        if (number < 2) {
            return false;
        }

        if (number % 2 == 0) {
            return (number == 2);
        }

        if (i * i > number) {
            return true;
        }

        if (number % i == 0) {
            return false;
        }

        //Recursive işlem
        return isPrime(number, i + 2);
    }
}
