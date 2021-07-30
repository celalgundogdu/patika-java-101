package conditions.homework3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Java ile kullanıcının girdiği yılın artık olup olmadığını
            bulan programı yazınız.
        */

        Scanner input = new Scanner(System.in);
        int year;
        boolean isLeapYear;

        System.out.print("Yıl: ");
        year = input.nextInt();

        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }

        if (isLeapYear){
            System.out.println(year + " bir artık yıldır");
        } else {
            System.out.println(year + " bir artık yıl değildir");
        }

    }

}
