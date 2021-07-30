package conditions.practise1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Java switch ile basit hesap makinesi yapımı.
        */

        Scanner input = new Scanner(System.in);
        int num1, num2, choice;

        System.out.print("İlk sayı: ");
        num1 = input.nextInt();
        System.out.print("İkinci sayı: ");
        num2 = input.nextInt();
        System.out.println("1. Toplama\n2. Çıkarma\n3. Çarpma\n4. Bölme ");
        System.out.println("Seçiminiz: ");
        choice = input.nextInt();

        switch(choice){
            case 1:
                System.out.println("Sonuç: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Sonuç: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Sonuç: " + (num1 * num2));
                break;
            case 4:
                switch (num2){
                    case 0:
                        System.out.println("0'a bölünemez");
                        break;
                    default:
                        System.out.println("Sonuç: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz.");
        }

    }

}
