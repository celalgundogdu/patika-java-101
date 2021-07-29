package homework1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Java ile kullanıcıdan boy ve kilo değerlerini alıp bir
            değişkene atayın. Aşağıdaki formüle göre kullanıcının
            "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
            Formül: Kilo (kg) / Boy(m) * Boy(m)
        */

        Scanner input = new Scanner(System.in);
        float height, weight;
        double bmi;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        height = input.nextFloat();
        System.out.print("Lütfen kilonuzu giriniz : ");
        weight = input.nextFloat();

        bmi = weight / (height * height);
        System.out.println("Vücut Kitle İndeksiniz : " + bmi);
    }
}
