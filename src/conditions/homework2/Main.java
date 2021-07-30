package conditions.homework2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Java ile kullanıcıdan doğum tarihini alıp
            Çin Zodyağı değerini hesaplayan program yazınız.
        */

        Scanner input = new Scanner(System.in);
        int birthYear, remainder;
        String horoscope = "";

        System.out.print("Doğum yılı: ");
        birthYear = input.nextInt();
        remainder = birthYear % 12;
        switch(remainder){
            case 0:
                horoscope = "Maymun";
                break;
            case 1:
                horoscope = "Horoz";
                break;
            case 2:
                horoscope = "Köpek";
                break;
            case 3:
                horoscope = "Domuz";
                break;
            case 4:
                horoscope = "Fare";
                break;
            case 5:
                horoscope = "Öküz";
                break;
            case 6:
                horoscope = "Kaplan";
                break;
            case 7:
                horoscope = "Tavşan";
                break;
            case 8:
                horoscope = "Ejderha";
                break;
            case 9:
                horoscope = "Yılan";
                break;
            case 10:
                horoscope = "At";
                break;
            case 11:
                horoscope = "Koyun";
                break;
            default:
                System.out.println("Hatalı giriş");
        }

        System.out.println("Burç: " + horoscope);
    }

}
