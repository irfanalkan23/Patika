package pratik.loopsPractice1;

import java.util.Scanner;

public class LoopsPractice1 {

    public static void main(String[] args) {

        int number, count=0, sum = 0;
        double average;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        number = input.nextInt();

        for (int i=1; i <= number; i++){
            if (i % 3 == 0 && i % 4 == 0){
                sum += i;
                count++;
            }
        }

        average = sum / count;
        System.out.println("Ortalama : " + average);
    }
}
