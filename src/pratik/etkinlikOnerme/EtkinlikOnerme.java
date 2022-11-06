package pratik.etkinlikOnerme;

import java.util.Scanner;

public class EtkinlikOnerme {

    public static void main(String[] args) {
        //Değişkenleri tanımlıyoruz
        int heat;

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan ders notları bilgisini alıyoruz
        System.out.print("Hava sıcaklığını giriniz : ");
        heat = input.nextInt();

        //Sıcaklık değerine göre etkinlik öneriyoruz.
        if (heat < 5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat <=15){
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (heat <=25){
            System.out.println("Pikniğe gidebilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

        input.close();
    }
}
