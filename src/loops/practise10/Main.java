package loops.practise10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.

        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        int min, max, gcd = 0, lcm = 0;

        System.out.print("İlk sayı: ");
        num1 = input.nextInt();
        System.out.print("İkinci sayı: ");
        num2 = input.nextInt();

        if (num1 < num2){
            min = num1;
            max = num2;
        } else{
            min = num2;
            max = num1;
        }

        int temp = min ;
        while(temp >= 1) {
            if (num1 % temp == 0 && num2 % temp == 0){
                gcd = temp;
                break;
            }
            temp--;
        }

        temp = max;
        while(temp <= num1*num2){
            if (temp % num1 == 0 && temp % num2 == 0){
                lcm = temp;
                break;
            }
            temp++;
        }

        System.out.println("Ebob: " + gcd);
        System.out.println("Ekok: " + lcm);
    }

}
