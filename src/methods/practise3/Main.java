package methods.practise3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    static int add(int num1, int num2){
        return num1 + num2;
    }

    static int subtract(int num1, int num2){
        return num1 - num2;
    }

    static int multiply(int num1, int num2){
        return num1 * num2;
    }

    static void divide(int num1, int num2){
        if ( num2 == 0){
            System.out.println("O'a bölünemez");
        }
        double result = Double.valueOf(num1) / Double.valueOf(num2);
        System.out.println("Sonuç:" + result);
    }

    static int exponent(int num1, int num2){
        int result = 1;
        for (int i = 0; i < num2; i++){
            result = result * num1;
        }
        return result;
    }

    static int factorial(int num){
        int result = 1;
        for (int i = num; i >= 1; i--){
            result = result * i;
        }
        return result;
    }

    static int mode(int num1, int num2){
        return num1 % num2;
    }

    static void calculateRectangle(int num1, int num2){
        System.out.println("Alan: " + num1 * num2);
        System.out.println("Çevre: " + 2*(num1+num2));
    }

    static int getSecondNumber(){
        System.out.print("İkinci sayı: ");
        return input.nextInt();
    }


    public static void main(String[] args) {

        // Java ile kullanıcın seçtiği işlemleri yapan hesap makinesi yapıyoruz.


        int choice;
        String menu = "1) Toplama\n" +
                "2) Çıkarma\n" +
                "3) Çarpma\n" +
                "4) Bölme\n" +
                "5) Üslü sayı\n" +
                "6) Faktöriyel\n" +
                "7) Mod\n" +
                "8) Dikdörtgen alanı ve çevresi\n";

        System.out.println(menu);
        int num1, num2;
        while(true) {
            System.out.print("İşlem türü: ");
            choice = input.nextInt();
            if ( choice == 0){
                break;
            }
            System.out.print("İlk sayı: ");
            num1 = input.nextInt();

            switch (choice) {
                case 1:
                    num2 = getSecondNumber();
                    System.out.println("Sonuç: "+ add(num1, num2));
                    break;
                case 2:
                    num2 = getSecondNumber();
                    System.out.println("Sonuç: "+ subtract(num1, num2));
                    break;
                case 3:
                    num2 = getSecondNumber();
                    System.out.println("Sonuç: "+ multiply(num1, num2));
                    break;
                case 4:
                    num2 = getSecondNumber();
                    divide(num1, num2);
                    break;
                case 5:
                    num2 = getSecondNumber();
                    System.out.println("Sonuç: "+ exponent(num1, num2));
                    break;
                case 6:
                    System.out.println("Sonuç: "+ factorial(num1));
                    break;
                case 7:
                    num2 = getSecondNumber();
                    System.out.println("Sonuç: "+ mode(num1, num2));
                    break;
                case 8:
                    num2 = getSecondNumber();
                    calculateRectangle(num1, num2);
                    break;
                default:
                    System.out.println("Geçersiz işlem türü");

            }
            System.out.println();
        }

    }

}
