package loops.practise2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Java döngüler ile tek bir sayı girilene kadar kullanıcıdan
            girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları
            olan sayıları toplayıp ekrana basan programı yazıyoruz.
        */

        Scanner input = new Scanner(System.in);
        int value = 0, sum = 0;
        do {
            System.out.print("Sayı: ");
            value = input.nextInt();
            if (value % 4 == 0){
                sum += value;
            }
        }while(value % 2 == 0);
        System.out.println("Toplam : " + sum);
    }

}
