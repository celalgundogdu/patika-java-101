package homework2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram
            değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
        */

        Scanner input = new Scanner(System.in);
        float pear = 2.14f, apple = 3.67f, tomato = 1.11f,
                banana = 0.95f, eggplant = 5, price;
        float pearKg, appleKg, tomatoKg, bananaKg, eggplantKg;

        System.out.print("Armut Kaç Kilo? : ");
        pearKg = input.nextFloat();
        System.out.print("Elma Kaç Kilo? : ");
        appleKg = input.nextFloat();
        System.out.print("Domates Kaç Kilo? : ");
        tomatoKg = input.nextFloat();
        System.out.print("Muz Kaç Kilo? : ");
        bananaKg = input.nextFloat();
        System.out.print("Patlıcan Kaç Kilo? : ");
        eggplantKg = input.nextFloat();

        price = (pear*pearKg) + (apple*appleKg) + (tomato*tomatoKg)
                + (banana*bananaKg) + (eggplant*eggplantKg);
        System.out.printf("Toplam Tutar : %.2f", price);
    }

}
