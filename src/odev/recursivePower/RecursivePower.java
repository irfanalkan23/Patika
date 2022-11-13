package odev.recursivePower;

import java.util.Scanner;

public class RecursivePower {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = input.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = input.nextInt();

        int result = power(base, exponent);
        System.out.println(result);
    }

    static int power(int base, int exponent){
        if (exponent != 0){
            return base * power(base, exponent-1);
        } else {
            return 1;
        }
    }
}
