package loops.practise4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Java ile kombinasyon hesaplayan program yazınız.

        Scanner input = new Scanner(System.in);
        int n, r, nFactorial = 1, rFactorial = 1, nrFactorial = 1, result;

        System.out.print("n: ");
        n = input.nextInt();
        System.out.print("r : ");
        r = input.nextInt();

        for(int i = 1; i <= n; i++){
            nFactorial *= i;
        }
        for(int i = 1; i <= r; i++){
            rFactorial *= i;
        }
        for(int i = 1; i <= n-r; i++){
            nrFactorial *= i;
        }

        result = nFactorial / (rFactorial * nrFactorial);
        System.out.println("Kombinasyon(n,r) : " + result);
    }

}
