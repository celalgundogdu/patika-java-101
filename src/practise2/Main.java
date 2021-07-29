package practise2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını
            ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        */

        Scanner input = new Scanner(System.in);
        double cost, taxedCost, taxAmount;
        float taxRate;

        System.out.print("Tutar: ");
        cost = input.nextDouble();
        taxRate = (cost > 0 && cost <= 1000) ? 0.18f : 0.08f;
        taxAmount = cost * taxRate;
        taxedCost = cost + taxAmount;
        System.out.println("KDV oranı: " + taxRate);
        System.out.printf("KDV miktarı: %.2f\n", taxAmount);
        System.out.printf("KDV'li tutar: %.2f", taxedCost);
    }

}
