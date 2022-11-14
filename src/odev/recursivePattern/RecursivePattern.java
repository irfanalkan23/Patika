package odev.recursivePattern;

import java.util.Scanner;

public class RecursivePattern {

    public static void main(String[] args) {

        //Kullanıcıdan 'N' sayısını alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int number = input.nextInt();

        //Recursive metodu çalıştırıyoruz ve çıktısını alıyoruz
        System.out.print("Çıktısı : ");
        pattern(pattern(number), number);

        input.close();
    }

    //Paternde 'N' sayısından geriye doğru 'N-5' çıktı alan overloaded recursive metod
    static int pattern(int n){
        if (n <= 0){
            return n;
        }
        System.out.print(n + " ");
        return pattern(n-5);
    }

    //Paternde ileri doğru 'N+5' çıktı alan overloading recursive metod
    static int pattern(int n, int i){
        if (n > i){
            return n;
        }
        System.out.print(n + " ");
        return pattern(n+5, i);
    }
}
