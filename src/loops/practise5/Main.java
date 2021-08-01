package loops.practise5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan
            programı "For Döngüsü" kullanarak yapınız.
        */

        Scanner input = new Scanner(System.in);
        int base, exponent, total = 1;

        System.out.print("Sayı: ");
        base = input.nextInt();
        System.out.print("Üs: ");
        exponent = input.nextInt();

        for (int i = 1; i<=exponent; i++){
            total *= base;
        }
        System.out.println("Sonuç: " + total);

    }

}
