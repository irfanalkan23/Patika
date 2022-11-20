package pratik.sayiTahmin;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {

    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int rights = 5;
        int guess;
        ArrayList<Integer> mistakes = new ArrayList<>();
        boolean isWin = false;
        boolean isMistake = false;

        while (rights > 0) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            guess = input.nextInt();

            if (guess < 0 || guess > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isMistake) {
                    rights--;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + rights);
                } else {
                    isMistake = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (guess == number) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğiniz sayı : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Bilemediniz !");
                if (guess > number) {
                    System.out.println(guess + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(guess + " sayısı, gizli sayıdan küçüktür.");
                }

                mistakes.add(guess);
                System.out.println("Kalan hakkınız : " + --rights);
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            System.out.println("Tahminleriniz : " + mistakes);
        }
    }
}
