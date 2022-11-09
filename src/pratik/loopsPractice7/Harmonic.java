package pratik.loopsPractice7;

import java.util.Scanner;

public class Harmonic {

    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz
        int n;
        double result;

        //Kullanıcıdan harmonik serisini hesaplayacağımız 'n' değerini alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Harmonik serisini bulmak istediğiniz sayıyı giriniz : ");
        n = input.nextInt();

        //Harmonik seriyi hesaplıyoruz
        result = 0.0;
        for (int i = 1; i <= n; i++) {
            result += 1.0/i;
        }

        //Sonucu yazdırıyoruz
        System.out.println("Sonuç : " + result);
    }
}
