package pratik.login;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        //Değişkenleri tanımlıyoruz
        String userName, password, select;

        //Kullanıcı adı ve şifre bilgilerini kullanıcıdan alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz : ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        password = input.nextLine();

        //Kullanıcı adı ve şifre bilgilerini kontrol ediyoruz.
        //Kullanıcı adı: "patika", şifre: "java123" olmalı
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız !");

            // Kullanıcı adı "patika" haricinde bir giriş yapıldıysa programı sonlandırıyoruz
        } else if (!userName.equals("patika")) {
            System.out.println("Hatalı giriş yaptınız !\nProgram sonlandı.");

            //Kullanıcı adı "patika" ama şifre hatalı ise kullanıcıya şifresini sıfırlamak isteyip istemediği soruyoruz
        } else {
            System.out.print("Bilgileriniz Yanlış !\n" +
                    "Şifrenizi sıfırlamak istiyor musunuz ? (\"e\"-evet/\"h\"-hayır) : ");
            select = input.nextLine();

            //Kullanıcı şifresini sıfırlamak isterse ("e") yeni şifreyi kullanıcıdan alıyoruz
            if (select.equalsIgnoreCase("e")) {
                System.out.print("Gireceğiniz şifre en son kullandığınız şifre ile aynı olmamalıdır!\n" +
                        "Yeni şifreyi giriniz : ");
                password = input.nextLine();

                //Kullanıcının unuttuğu şifre ile aynı olması durumunda başka şifre talep ediyoruz
                while (true) {
                    if (password.equals("java123")) {
                        System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz : ");
                        password = input.nextLine();
                    } else {
                        break;
                    }
                }

                //Kullanıcı unuttuğu şifreden farklı bir şifre girdiğinde "Şifre oluşturuldu" mesajı yazdırılır
                System.out.println("Şifre oluşturuldu.");

                //Kullanıcı şifresini sıfırlamak istemezse  ("h") programdan çıkıyoruz
            } else if (select.equalsIgnoreCase("h")) {
                System.out.println("Program sonlandı.");

                //Kullanıcı "e" ve "h" dışında bir karakter girerse programı sonlandırıyoruz
            } else {
                System.out.println("Geçersiz giriş yaptınız !\nProgram sonlandı.");
            }
        }
    }
}
