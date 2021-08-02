package methods.homework3;

import java.util.Scanner;

public class Main {

    static void goFive(int number, int temp, boolean isAgain){

        if (temp > number){
            return;
        }
        System.out.print(temp + " ");
        if (temp > 0 && isAgain == false){
            goFive(number, temp-5, false);
        } else {
            goFive(number, temp+5, true);
        }

    }

    public static void main(String[] args) {

        /*
            Kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.
            Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
            Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
            Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı: ");
        int n = input.nextInt();
        goFive(n, n, false);
    }

}
