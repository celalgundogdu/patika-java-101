package conditions.practise2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Java koşullu ifadeler ile kullanıcı adı ve şifreyi
            kontrol eden program yapımı.
        */

        Scanner input = new Scanner(System.in);
        String userName = "patika", password = "java123";
        String inputUserName, inputPassword, choice;

        System.out.print("Kullanıcı adınız: ");
        inputUserName = input.nextLine();
        System.out.print("Şifreniz: ");
        inputPassword = input.nextLine();

        if (inputUserName.equals(userName)){
            if (inputPassword.equals(password)){
                System.out.println("Sisteme giriş yaptınız.");
            } else {
                System.out.println("Yanlış şifre");
                System.out.print("Şifreyi sıfırlamak ister misiniz? (Evet / Hayır) : ");
                choice = input.nextLine();
                if (choice.toUpperCase().equals("EVET")){
                    System.out.print("Yeni şifre: ");
                    String newPassword = input.nextLine();
                    if (!newPassword.equals(password)){
                        System.out.println("Şifre oluşturuldu");
                        password = newPassword;
                    } else {
                        System.out.println("Şifre oluşturulamadı. Lütfen başka şifre giriniz");
                    }
                }
            }
        } else {
            System.out.println("Yanlış kullanıcı adı");
        }

    }

}
