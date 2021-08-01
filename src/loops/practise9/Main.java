package loops.practise9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Java döngüler ile kullanıcının banka hesabını yönetebildiği
            bir ATM projesi "Switch-Case" kullanarak yapınız.
        */

        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3, choice = 0;
        int balance = 1500;

        while(right > 0 && choice != 4 ){
            System.out.print("Kullanıcı adı: ");
            userName = input.nextLine();
            System.out.print("Şifre: ");
            password = input.nextLine();
            switch (userName){
                case "patika":
                    switch (password){
                        case "dev123":
                            System.out.println("Sisteme giriş yapıldı.");
                            do {
                                System.out.println("1- Para Yatırma\n2- Para Çekme" +
                                        "\n3- Bakiye Sorgula\n4-Çıkış Yap");
                                System.out.print("İşlem türü seçiniz: ");
                                choice = input.nextInt();
                                int price = 0;
                                switch (choice){
                                    case 1:
                                        System.out.print("Eklenecek Miktar: ");
                                        price = input.nextInt();
                                        balance += price;
                                        break;
                                    case 2:
                                        System.out.print("Çekilecek Miktar: ");
                                        price = input.nextInt();
                                        int remainder = (balance - price >= 0) ? balance-price : 0;
                                        switch (remainder){
                                            case 0:
                                                System.out.println("Bakiye yetersiz");
                                                break;
                                            default:
                                                balance = balance - price;
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Bakiye: " + balance);
                                        break;
                                    case 4:
                                        System.out.println("Çıkış yapılıyor");
                                        break;
                                    default:
                                        System.out.println("Geçersiz işlem türü.");
                                }
                            }while(choice != 4);
                            System.out.println("Hoşçakalın.");
                            break;
                        default:
                            System.out.println("Yanlış şifre");
                            right--;
                            switch (right){
                                case 0:
                                    System.out.println("Hesap bloke edildi");
                                    break;
                            }
                    }
                    break;
                default:
                    System.out.println("Yanlış kullanıcı adı");
            }
        }

    }

}
