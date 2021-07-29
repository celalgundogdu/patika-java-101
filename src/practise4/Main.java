package practise4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
            Taksimetre KM başına 2.20 TL tutmaktadır. Taksimetre açılış ücreti 10 TL'dir.
            Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        */

        Scanner input = new Scanner(System.in);
        double distanceInKm, costPerKm, opening, price, total;
        costPerKm = 2.20;
        opening = 10;

        System.out.print("Gidilen mesafe(Kilometre): ");
        distanceInKm = input.nextDouble();
        price = opening + (distanceInKm * costPerKm);
        total =  (price >= 20) ? price : 20;
        System.out.println("Total: " + total);
    }

}
