package loops.homework2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan
            ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel
            sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.
        */

        Scanner input = new Scanner(System.in);
        int number, sum = 0;
        boolean isEqual;
        System.out.print("Sayı: ");
        number = input.nextInt();

        for (int i = 1; i < number; i++){
            if (number % i == 0){
                sum += i;
            }
        }
        isEqual = (sum == number);
        if (isEqual){
            System.out.println(number + " mükemmel sayıdır");
        } else {
            System.out.println(number + " mükemmel sayı değildir");
        }
    }

}
