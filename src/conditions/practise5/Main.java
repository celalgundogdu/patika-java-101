package conditions.practise5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Java koşullu ifadeler ile girilen 3 sayıyı
            büyükten küçüğe sıralayan program yapımı.
        */

        Scanner input = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("İlk sayı: ");
        num1 = input.nextInt();
        System.out.print("İkinci sayı: ");
        num2 = input.nextInt();
        System.out.print("Üçüncü sayı: ");
        num3 = input.nextInt();

        if (num1<num2 && num1<num3){
            if (num2 < num3){
                System.out.println(num1 + "<" + num2 + "<" + num3);
            } else {
                System.out.println(num1 + "<" + num3 + "<" + num2);
            }
        } else if (num2<num1 && num2<num3){
            if (num1< num3){
                System.out.println(num2 + "<" + num1 + "<" + num3);
            } else {
                System.out.println(num2 + "<" + num3 + "<" + num1);
            }
        } else {
            if (num1< num2){
                System.out.println(num3 + "<" + num1 + "<" + num2);
            } else {
                System.out.println(num3 + "<" + num2 + "<" + num1);
            }
        }

    }

}
