package loops.practise3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Java döngüler ile girilen sayıya kadar olan 4 ve 5'in
            kuvvetlerini ekrana yazdıran programı yazıyoruz.
        */

        Scanner input = new Scanner(System.in);
        int value = 0;
        System.out.print("Sayı: ");
        value = input.nextInt();
        for (int i = 1; i < value; i*=4){
            System.out.println(i);
        }
        for (int i = 1; i < value; i*=5){
            System.out.println(i);
        }

    }

}
