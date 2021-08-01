package loops.practise7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Java ile girilen sayının harmonik serisini bulan program yazınız.

        Scanner input = new Scanner(System.in);
        int number;
        double total = 0;
        System.out.print("Sayı: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++){
            total += 1.0 / i;
        }
        System.out.println("Harmonik seri toplamı: " + total);
    }

}
