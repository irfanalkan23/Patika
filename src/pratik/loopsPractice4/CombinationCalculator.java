package pratik.loopsPractice4;

import java.util.Scanner;

public class CombinationCalculator {

    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz
        int n, r;
        double combination;

        //Kullanıcıdan n ve r değerlerini alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("C(n,r) kombinasyonu hesaplamak için 'n' değerini giriniz : ");
        n = input.nextInt();
        System.out.print("C(n,r) kombinasyonu hesaplamak için 'r' değerini giriniz : ");
        r = input.nextInt();

        //"n" ve "r" değerlerinin pozitif Integer olması gerekmektedir
        while (n < 0){
            System.out.print("'n' değeri negatif olamaz! Tekrar giriniz : ");
            n = input.nextInt();
        }

        while (r < 0){
            System.out.print("'r' değeri negatif olamaz! Tekrar giriniz : ");
            r = input.nextInt();
        }

        //"r" sayısı "n" sayısından küçük veya eşit olmalıdır, aksi takdirde hata mesajı yazdırıyoruz
        while (r>n){
            System.out.print("'r' sayısı 'n' sayısından küçük veya eşit olmalıdır!" +
                    "\n'r' sayısını tekrar giriniz : ");
            r = input.nextInt();
        }

        //Kombinasyonu hesaplıyoruz
        combination = factorial(n) / (factorial(r) * factorial(n-r));

        System.out.println("C(" + n + "," + r+ ") kombinasyon sonucu : " + combination);

        input.close();
    }

    //Faktöryel hesaplayan metot tanımlıyoruz
    public static int factorial(int number){
        int result = 1;
        for (int i=1; i<=number; i++){
            result *= i;
        }
        return result;
    }

}
