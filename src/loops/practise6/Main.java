package loops.practise6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

        Scanner input = new Scanner(System.in);
        int number, numberOfDigits = 0, temp, sum = 0;

        System.out.print("Sayı: ");
        number = input.nextInt();
        temp = number;
        while(temp != 0){
            temp = temp / 10;
            numberOfDigits++;
        }
        temp = number;
        while (temp != 0){
            sum += temp % 10;
            temp = temp / 10;
        }
        System.out.println("Basamaklar toplamı: " + sum);

    }
}
