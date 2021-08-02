package methods.homework2;

import java.util.Scanner;

public class Main {

    static boolean isPrime(int number, int temp){
        if (number <= 2){
            if (number == 2){
                return true;
            } else {
                return false;
            }
        }
        if (number % temp == 0){
            return false;
        }
        if (temp * temp > number){
            return true;
        }
        return isPrime(number, temp+1);
    }


    public static void main(String[] args) {

        /*
            "Recursive" metot kullanarak, kullanıcıdan alınan sayının
            "Asal" sayı olup olmadığını bulan programı yazın.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı: ");
        int number = input.nextInt();
        System.out.println(isPrime(number, 2));

    }

}
