package pratik.loopsPractice9;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz
        String userName, password;
        String validUserName = "user1";
        String validPassword = "patika";
        int attemptLimit = 3;
        int attempt = 0;
        int choice;
        double balance = 1000;

        Scanner input = new Scanner(System.in);

        //Doğru kullanıcı adı ve şifre girişini attemptLimit ile sınırlayan döngü oluşturuyoruz
        while(attempt <= attemptLimit){

            //Kullanıcıdan kullanıcı adı ve şifre istiyoruz
            System.out.print("Enter username : ");
            userName = input.nextLine();
            System.out.print("Enter password : ");
            password = input.nextLine();

            //Kullanıcı adı - şifre teşebbüsünü bir artırıyoruz
            attempt++;

            //Kullanıcı adı ve şifrenin doğruluğunu kontrol ediyoruz
            if(userName.equals(validUserName) && password.equals(validPassword)){
                System.out.println("Hello, welcome to Patika Bank!");

                //Eğer kullanıcı adı ve şifre doğruysa ATM işlemlerini listeliyoruz
                do {
                    System.out.println("1-Deposit\n" +
                            "2-Withdraw\n" +
                            "3-Check Balance\n" +
                            "4-Exit");

                    //Kullanıcıdan ATM işlem tercihini alıyoruz
                    System.out.print("Choose the operation you want to perform : ");
                    choice = input.nextInt();

                    //ATM işlem tercihi doğrultusunda işlem gerçekleştiriyoruz
                    switch (choice){
                        case 1:
                            System.out.print("Enter the amount to be deposited : ");
                            balance += input.nextInt();
                            break;
                        case 2:
                            System.out.print("Enter amount to be withdrawn : ");
                            int amount = input.nextInt();

                            //Eğer çekilmek istenen tutar bakiyeden fazla ise hata mesajı veriyoruz
                            if (amount > balance){
                                System.out.println("Insufficient balance : " + balance);
                            } else {
                                //Çekilmek istenen miktar bakiyeden fazla değilse işlemi gerçekleştiriyoruz
                                balance -= amount;
                            }
                            break;
                        case 3:
                            System.out.println("Balance : " + balance);
                            break;
                        case 4:
                            System.out.println("See you again!");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid choice! Try again!");
                    }
                } while(choice != 4);
            } else {

                //Kullanıcı adı veya şifre hatalı ise hata mesajı veriyoruz
                System.out.println("Invalid username or password!");

                //Kullanıcı adı ve şifresi hatalı teşebbüs limiti geçerse hesabı bloke ediyor ve programı sonlandırıyoruz
                if (attempt == 3){
                    System.out.println("Account is blocked. Contact customer relations.");
                    System.exit(0);
                } else {
                    System.out.println("Attempt left : " + (attemptLimit - attempt));
                }
            }
        }
    }
}
