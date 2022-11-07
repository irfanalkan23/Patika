package odev.cinZodyagi;

import java.util.Scanner;

public class ChineseZodiac {

    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz
        int birthYear;
        String chineseZodiac;

        //Kullanıcıdan doğum yılı girdisini alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        birthYear = input.nextInt();

        //Doğum yılına göre Çin Zodyağı hesaplıyoruz
        switch (birthYear % 12){
            case 0:
                chineseZodiac = "Maymun";
                break;
            case 1:
                chineseZodiac = "Horoz";
                break;
            case 2:
                chineseZodiac = "Köpek";
                break;
            case 3:
                chineseZodiac = "Domuz";
                break;
            case 4:
                chineseZodiac = "Fare";
                break;
            case 5:
                chineseZodiac = "Öküz";
                break;
            case 6:
                chineseZodiac = "Kaplan";
                break;
            case 7:
                chineseZodiac = "Tavşan";
                break;
            case 8:
                chineseZodiac = "Ejderha";
                break;
            case 9:
                chineseZodiac = "Yılan";
                break;
            case 10:
                chineseZodiac = "At";
                break;
            default:
                chineseZodiac = "Koyun";
        }

        System.out.println("Çin Zodyağı Burcunuz : " + chineseZodiac);

    }
}
