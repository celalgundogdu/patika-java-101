package loops.homework3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
            yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Satır sayısı: ");
        int row = input.nextInt();

        for (int i = row; i > 0; i--){
            for (int j = row; j > i ; j--){
                System.out.print(" ");
            }
            for (int k = 2*i-1; k > 0; k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
