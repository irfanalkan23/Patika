package odev.palindromSayi;

import java.util.Scanner;

public class PalindromSayi {

    public static void main(String[] args) {

        //Kullanıcıdan bir sayı alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Palindrom Sayı Bulma Programına Hoşgeldiniz!\nBir sayı giriniz : ");
        int n = input.nextInt();

        //Girilen sayının palindrom olup olmadığını buluyoruz
        if (isPalindrome(n)){
            System.out.println(n + " sayısı palindrom bir sayıdır.");
        } else {
            System.out.println(n + " sayısı palindrom değildir.");
        }
    }

    //Bir sayının palindrom olup olmadığını bulan metod
    public static boolean isPalindrome(int number){
        if (number == reverse(number)){
            return true;
        }
        return false;
    }

    //Bir sayının basamaklarını ters çeviren metod
    public static int reverse(int number){
        int temp = number;
        int reverseNumber = 0;
        while(temp != 0){
            int digit = temp % 10;
            reverseNumber = (reverseNumber * 10) + digit;
            temp /= 10;
        }
        return reverseNumber;
    }

}
