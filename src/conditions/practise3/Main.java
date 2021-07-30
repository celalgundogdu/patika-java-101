package conditions.practise3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Java koşullu ifadeler ile kullanıcının not durumuna
            göre sınıfı geçme durumunu hesaplayan program yapımı.
        */

        Scanner input = new Scanner(System.in);
        int math, physics, turkish, chemistry, music;

        System.out.print("Matematik notu: ");
        math = input.nextInt();
        System.out.print("Fizik notu: ");
        physics = input.nextInt();
        System.out.print("Türkçe notu: ");
        turkish = input.nextInt();
        System.out.print("Kimya notu: ");
        chemistry = input.nextInt();
        System.out.print("Müzik notu: ");
        music = input.nextInt();

        int sum = 0;
        if (math >= 0 && math <= 100){
            sum = sum + math;
        }
        if (physics >= 0 && physics <= 100){
            sum = sum + physics;
        }
        if (turkish >= 0 && turkish <= 100){
            sum = sum + turkish;
        }
        if (chemistry >= 0 && chemistry <= 100){
            sum = sum + chemistry;
        }
        if (music >= 0 && music <= 100){
            sum = sum + music;
        }

        double average = sum / 5;
        if (average >= 55) {
            System.out.println("Geçtiniz");
        } else {
            System.out.println("Kaldınız");
        }
        System.out.println("Ortalama: " + average);

    }

}
