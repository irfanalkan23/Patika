package pratik.loopsPractice2;

import java.util.Scanner;

public class LoopsPractice2 {

    public static void main(String[] args) {

        int number;
        int total = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("This program finds the sum of the numbers that are evenly divisible by 4.\n" +
                "Enter an odd number to end the program and see the result.");

        do {
            System.out.print("Please enter a number : ");
            number = input.nextInt();
            if (number % 4 == 0){
                total += number;
            }
        } while (number % 2 == 0);

        System.out.println("Toplam : " + total);
    }
}
