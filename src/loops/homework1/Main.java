package loops.homework1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Java ile klavyeden girilen N tane sayma sayısından en büyük
            ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
        */

        Scanner input = new Scanner(System.in);
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int value, n;
        System.out.print("Girilecek sayı adedi: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.print(i + ". Sayı: ");
            value = input.nextInt();
            if (value < min){
                min = value;
            }
            if(value > max){
                max = value;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }

}
