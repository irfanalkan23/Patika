package pratik.loopsPractice6;

import java.util.Scanner;

public class NumberOfDigits {

    public static void main(String[] args) {

        int number;
        int digit;
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        number = input.nextInt();

        while (number != 0){
            digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("Girdiğiniz sayının basamak değerlerinin toplamı : " + sum);

        input.close();
    }
}
