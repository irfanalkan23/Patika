package pratik.loopsPractice8;

import java.util.Scanner;

public class StarTriangle {

    public static void main(String[] args) {

        //Kullanıcıdan kaç satırlık yıldız oluşturmak istediğini alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Oluşturulacak yıldızın satır sayısını (pozitif tek sayı) giriniz : ");
        int n = input.nextInt();

        //Tek sayı haricinde sayı girilmesi durumunda hata mesajı veriyoruz
        while (n % 2 != 1){
            System.out.print("Hatalı bilgi girdiniz : " + n + "\nLütfen pozitif tek sayı giriniz : ");
            n = input.nextInt();
        }
        
        //Yıldızın ilk yarısını oluşturuyoruz
        for (int i = 1; i <= (n/2 + 1); i++) {

            //Her bir satırdaki boşlukları yazdırıyoruz
            for (int j = 1; j <= (n/2+ 1) - i; j++) {
                System.out.print(" ");
            }
            
            //Her bir satırdaki yıldızı yazdırıyoruz
            for (int j = 0; j < (2*i - 1); j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
        
        //Yıldızın ikinci yarısını oluşturuyoruz
        for (int i = 1; i <= n/2; i++) {

            //Her bir satırdaki boşlukları yazdırıyoruz
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            //Her bir satırdaki yıldızları yazdırıyoruz
            for (int j = 1; j <= (n - 2*i) ; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
