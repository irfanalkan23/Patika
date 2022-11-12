package odev.asalSayilar;

public class AsalSayilar {

    public static void main(String[] args) {

        //Değişken tanımlıyoruz
        boolean isPrime;

        //Asal sayılar 2'den başladığı için 2 ile 100 arasında döngü kuruyoruz
        for (int i = 2; i <= 100; i++) {
            isPrime=true;   //Her i döngüsünde isPrime değerini "true" atıyoruz

            //Her bir i sayısının kendisinden başka böleni olup olmadığını kontrol ediyoruz
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    isPrime = false;    //Eğer kendisinden başka sayıya bölünüyorsa isPrime "false" atıyoruz
                }
            }

            //Eğer asal sayı ise yazdırıyoruz
            if (isPrime){
                System.out.print(i + " ");
            }
        }
    }
}
