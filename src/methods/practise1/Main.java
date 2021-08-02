package methods.practise1;

import java.util.Scanner;

public class Main {

    static boolean isPalindrom(int number){
        int temp = number, reversedNumber = 0, lastDigit;
        while (temp != 0){
            lastDigit  = temp % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            temp = temp / 10;
        }
        System.out.println("Reversed sayı: " + reversedNumber);
        if (number == reversedNumber){
            return true;
        }
        return false;
    }

    public static void main(String args[]) {

        // Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı: ");
        int number = input.nextInt();
        System.out.println((isPalindrom(number)) ? (number + " palindromdur") : (number + " palindrom degildir"));
    }

}
