package mathAndStringLibraries.practise1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının
            tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.
        */

        Scanner input = new Scanner(System.in);
        int randomNumber = (int)(Math.random() * 100);
        int[] wrongGuesses = new int[5];
        int index = 0;
        int right = 5;
        int guess;
        boolean isFound = false;
        boolean isBoundError = false;
        while (right > 0){
            System.out.println("================================");
            System.out.print("Tahmin: ");
            guess = input.nextInt();
            if (guess < 0 || guess >= 100){
                System.out.println("0 ile 100 arasinda bir deger giriniz!");
                if (!isBoundError){
                    isBoundError = true;
                    System.out.println("Sonraki alan disi girislerde hakkiniz azalacaktir!");
                } else {
                    right--;
                    System.out.println("Tekrar alan disi giris yaptınız!");
                    System.out.println("Kalan hak: " + right);
                }
                continue;
            }
            if (guess == randomNumber){
                System.out.println("Tebrikler, dogru bildiniz!");
                isFound = true;
                break;
            } else {
                if (guess > randomNumber){
                    System.out.println("Daha kucuk");
                } else {
                    System.out.println("Daha buyuk");
                }
                wrongGuesses[index] = guess;
                index++;
                right--;
                System.out.println("Kalan hak: " + right);
            }
        }
        System.out.println("--------------------------------");
        if (!isFound){
            System.out.println("Kaybettiniz.");
            if (!isBoundError){
                System.out.println("Tahminleriniz: " + Arrays.toString(wrongGuesses));
            }
            System.out.println("Random sayi: " + randomNumber);
        }

    }

}
