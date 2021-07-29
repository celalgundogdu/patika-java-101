package variables.practise1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik
            derslerinin sınav puanlarını kullanıcıdan alan ve
            ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
        */

        Scanner input = new Scanner(System.in);
        int math, pyhsics, chemistry, turkish, history, music;

        System.out.print("Matematik notu: ");
        math = input.nextInt();

        System.out.print("Fizik notu: ");
        pyhsics = input.nextInt();

        System.out.print("Kimya notu: ");
        chemistry = input.nextInt();

        System.out.print("Türkçe notu: ");
        turkish = input.nextInt();

        System.out.print("Tarih notu: ");
        history = input.nextInt();

        System.out.print("Müzik notu: ");
        music = input.nextInt();

        double average = (math + pyhsics + chemistry + turkish + history + music) / 6;
        System.out.println("Ortalama not: " + average);

        String result = (average >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(result);
    }
}
