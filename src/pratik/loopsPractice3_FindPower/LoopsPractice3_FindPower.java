package pratik.loopsPractice3_FindPower;

import java.util.Scanner;

public class LoopsPractice3_FindPower {

    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz
        int limitNumber, result=1;

        //Kullanıcıdan limit değeri alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Bu program gireceğiniz pozitif tamsayıya kadar olan 4'ün ve 5'in kuvvetlerini bulur.\n" +
                "Limit sayıyı giriniz : ");
        limitNumber = input.nextInt();

        //Girilen değer 1'den küçük ise hata mesajı veriyoruz ve tekrar değer girmesini istiyoruz
        while (limitNumber < 1){
            System.out.print("Hatalı giriş yaptınız! : " + limitNumber +
                        "\nLütfen pozitif bir tamsayı giriniz : ");
            limitNumber = input.nextInt();
        }

        //Limit değere kadar olan 4'ün kuvvetlerini yazdırıyoruz
        System.out.println("4'ün kuvvetleri :");
        for (int i=1; result <= limitNumber; i++){
            System.out.println(result);
            result *= 4;
        }

        //Limit değere kadar olan 5'in kuvvetlerini yazdırıyoruz
        result = 1;
        System.out.println("5'in kuvvetleri :");
        for (int i=1; result <= limitNumber; i++){
            System.out.println(result);
            result *= 5;
        }

        input.close();
    }
}
