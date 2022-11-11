package pratik.loopsPractice10;

import java.security.interfaces.ECKey;
import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz
        int n1, n2, min, max, i=1;
        int ebob = 1, ekok = 1;

        //Kullanıcıdan iki sayı girdisi alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.println("EBOB ve EKOK değerlerini bulmak istediğiniz iki sayı girin.");
        System.out.print("Birinci sayıyı girin : ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı girin : ");
        n2 = input.nextInt();

        //Girilien sayılardan küçüğünü buluyoruz
        if (n1 < n2){
            min = n1;
            max = n2;
        } else {
            min = n2;
            max = n1;
        }

        //Küçük sayıya kadar olan bir döngü ile EBOB'u buluyoruz
        while (i <= min){
            if (min % i == 0 && max % i == 0){
                ebob = i;
            }
            i++;
        }

        //İki sayının EKOK'unu buluyoruz
        ekok = (n1 * n2) / ebob;

        System.out.println(n1 + " ve " + n2 + " sayılarının EBOB'u : " + ebob);
        System.out.println(n1 + " ve " + n2 + " sayılarının EKOK'u : " + ekok);
    }
}
