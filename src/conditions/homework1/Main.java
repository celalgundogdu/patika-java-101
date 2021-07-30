package conditions.homework1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın
        */

        Scanner input = new Scanner(System.in);
        int distance, age, type = 0, total;
        double pricePerKm = 0.1;
        boolean isError = false;
        float ageDiscount = 0, typeDiscount = 0;
        int ageDiscountAmount, typeDiscountAmount, discountedPrice;

        System.out.print("Mesafe (Km): ");
        distance = input.nextInt();
        System.out.print("Yaş: ");
        age = input.nextInt();
        System.out.print("Uçuş tipi (Tek yön (1) - Gidiş Dönüş (2)): ");
        type = input.nextInt();

        if ((distance > 0 && age > 0) && (type == 1 || type == 2)){
            if (age < 12){
                ageDiscount = 0.5f;
            } else if (age < 24){
                ageDiscount = 0.1f;
            } else if (age > 65) {
                ageDiscount = 0.3f;
            }
            if (type == 2){
                typeDiscount = 0.2f;
            }
        } else {
            isError = true;
        }

        if (isError){
            System.out.println("Hatalı veri girişi yapıldı.");
        } else {
            total = (int) (pricePerKm * distance);
            ageDiscountAmount = (int) (total*ageDiscount);
            discountedPrice = total - ageDiscountAmount;
            typeDiscountAmount = (int) (discountedPrice * typeDiscount);

            System.out.println("Normal Tutar: " + total);
            System.out.println("Yaş indirimi: " + ageDiscountAmount);
            System.out.println("İndirimli tutar: " + discountedPrice);
            System.out.println("Gidiş-Dönüş indirimi: " + typeDiscountAmount);
            System.out.println("Toplam Tutar: " + (discountedPrice-typeDiscountAmount)*type);
        }

    }

}
