package loops.homework5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Java döngüler ile fibonacci serisi bulan program yazıyoruz.
            Fibonacci serisinin eleman sayısını kullanıcıdan alın.
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısı: ");
        int numberOfElements = input.nextInt();
        int num1 = 0, num2 = 1, num3;
        for (int i = 0; i <= numberOfElements; i++){
            System.out.print(num1 + " ");
            num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }

    }

}
