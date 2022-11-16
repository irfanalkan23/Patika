package pratik.arrayHarmonikOrtalama;

public class ArrayHarmonikOrtalama {

    public static void main(String[] args) {

        //Array tanımlıyoruz
        int [] numbers = {1,2,3,4,5};

        //Harmonik ortalamayı yazdırıyoruz
        System.out.println("Harmonik ortalama : " + harmonicMean(numbers));
    }

    //Array'in harmonik serisini bulan metot
    public static double harmonicMean(int[] arr){
        double sum = 0.0;
        //Harmonik seriyi buluyoruz
        for (int i : arr) {
            if (i != 0) {
                sum += 1.0 / i;
            } else {
                System.out.println("Array'deki elemanlar arasında '0' tespit edildi ve hesaplama dışı bırakıldı!");
            }
        }
        //Harmonik ortalamayı buluyoruz : n (eleman sayısı) / elemanların harmonik serisi
        return arr.length / sum;
    }

}
