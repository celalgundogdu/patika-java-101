package arrays.practise2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

        int[] array = {30, -20, 15, 25, -17, 35, 3, -5, 10};
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı: ");
        int number = input.nextInt();
        int smallNearest = 0, bigNearest = 0;
        boolean isSmallest = false, isBiggest = false;
        Arrays.sort(array);
        if (number <= array[0]){
            bigNearest = array[0];
            isSmallest = true;
        }
        if(number >= array[array.length-1]){
            smallNearest = array[array.length-1];
            isBiggest = true;
        }
        if (!isSmallest && !isBiggest) {
            for (int i = 1; i < array.length; i++) {
                if(number < array[i]){
                    bigNearest = array[i];
                    smallNearest = array[i-1];
                    break;
                }
            }
        }
        if (isBiggest){
            System.out.println("Girilen sayidan kucuk en yakin sayi: " + smallNearest);
            System.out.println("Girilen sayidan buyuk bir sayi dizide yoktur");
        } else if(isSmallest){
            System.out.println("Girilen sayidan buyuk en yakin sayi: " + bigNearest);
            System.out.println("Girilen sayidan kucuk bir sayi dizide yoktur");
        } else {
            System.out.println("Girilen sayidan kucuk en yakin sayi: " + smallNearest);
            System.out.println("Girilen sayidan buyuk en yakin sayi: " + bigNearest);
        }

    }

}
