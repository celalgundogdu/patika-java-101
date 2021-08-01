package loops.practise1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
            3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
        */

        Scanner input = new Scanner(System.in);
        int value, iteration = 0;
        double sum = 0;

        System.out.print("Sayı: ");
        value = input.nextInt();
        for (int i=1; i<value; i++){
            if (i % 12 == 0){
                sum += i;
                iteration++;
            }
        }

        System.out.println("Ortalama : " + sum/iteration);
    }

}
