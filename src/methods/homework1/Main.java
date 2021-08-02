package methods.homework1;

import java.util.Scanner;

public class Main {

    public static int calculateExponent(int base, int exponent){
        if (exponent > 0) {
            return base * calculateExponent(base, exponent - 1);
        }
        return 1;
    }

    public static void main(String[] args) {

        /*
            Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma
             işlemini "Recursive" metot kullanarak yapan programı yazınız.
        */

        Scanner input = new Scanner(System.in);
        int base, exponent;
        System.out.print("Taban: ");
        base = input.nextInt();
        System.out.print("Üs: ");
        exponent = input.nextInt();
        int result = calculateExponent(base, exponent);
        System.out.println(result);
    }

}
