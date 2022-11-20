package pratik.palindromKelime;

import java.util.Scanner;

public class PalindromString {

    public static void main(String[] args) {

        //Kullanıcıdan bir kelime alıyoruz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String str = scanner.nextLine();

        //isPalindrome() metodunu çağırarak kelimenin palindrom olup olmadığını bulup yazdırıyoruz.
        if (isPalindrome(str)){
            System.out.println("'" + str + "' kelimesi Palindrom'dur.");
        } else {
            System.out.println("'" + str + "' kelimesi Palindrom değildir.");
        }
    }

    //Verilen bir string'in palindrom olup olmadığını tespit eden ve boolean olarak geri dönen metot
    public static boolean isPalindrome(String str){
        boolean result = false;

        for (int i = 0; i < str.length(); i++) {
            result = (str.charAt(i) == str.charAt(str.length() - 1 - i));
        }

        return result;
    }
}
