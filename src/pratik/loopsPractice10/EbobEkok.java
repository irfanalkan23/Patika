package pratik.loopsPractice10;

import java.security.interfaces.ECKey;
import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz
        int n1, n2, min, max, count=2;
        int ebob = 1, ekok = 1;

        //Kullanıcıdan iki sayı girdisi alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.println("EBOB'unu bulmak için iki sayı girin.");
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

        //Küçük sayısa kadar döngü ile EBOB'u buluyoruz
        while (count <= min){
            if (min % count == 0 && max % count == 0){
                ebob = count;
            }
            count++;
        }

        System.out.println("EBOB = " + ebob);

        //EKOK'u bulmak için kullanıcıdan iki sayı alıyoruz
        System.out.println("EKOK'unu bulmak için iki sayı girin.");
        System.out.print("Birinci sayıyı girin : ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı girin : ");
        n2 = input.nextInt();

        //İki sayının EKOK'unu buluyoruz
        count = 2;
        while (count <= (n1 * n2)){
            if (count % n1 == 0 && count % n2 == 0){
                ekok = count;
                break;
            }
            count++;
        }

        System.out.println("EKOK = " + ekok);
    }
}
