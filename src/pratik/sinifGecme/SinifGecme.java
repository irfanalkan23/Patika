package pratik.sinifGecme;

import java.util.Scanner;

public class SinifGecme {

    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz
        int math, physics, turkish, chemistry, music;

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan ders notları bilgisini alıyoruz
        System.out.print("Matematik notunuz : ");
        math = input.nextInt();

        System.out.print("Fizik notunuz : ");
        physics = input.nextInt();

        System.out.print("Kimya notunuz : ");
        chemistry = input.nextInt();

        System.out.print("Turkçe notunuz : ");
        turkish = input.nextInt();

        System.out.print("Müzik notunuz : ");
        music = input.nextInt();

        //Geçerli ders notu adedini tanımlıyoruz
        int count = 5;

        //Geçerli olmayan ders notlarını ortalamaya katmıyoruz
        if (math < 0 || math > 100){
            math = 0;
            count--;
        }

        if (physics < 0 || physics > 100){
            physics = 0;
            count--;
        }

        if (chemistry < 0 || chemistry > 100){
            chemistry = 0;
            count--;
        }

        if (turkish < 0 || turkish > 100){
            turkish = 0;
            count--;
        }

        if (music < 0 || music > 100){
            music = 0;
            count--;
        }

        //Ortalamayı hesaplıyoruz
        double average = (math + physics + turkish + chemistry + music) / count;

        //Sınıfı geçip geçmediğini yazdırıyoruz
        if (average < 55){
            System.out.println("Sınıfta kaldınız!");
        } else {
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        }

        //Ortalamayı yazdırıyoruz
        System.out.println("Ortalamanız : " + average);
    }
}
