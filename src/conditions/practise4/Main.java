package conditions.practise4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Java koşullu ifadeler ile hava sıcaklığına
            göre etkinlik öneren program yapımı.
        */

        Scanner input = new Scanner(System.in);
        float temperature;
        System.out.print("Sıcaklık: ");
        temperature = input.nextFloat();

        if (temperature < 5){
            System.out.println("Kayak yapabilirsiniz");
        } else if (temperature < 15){
            System.out.println("Sinemaya gidebilirsiniz");
        } else if (temperature < 25){
            System.out.println("Piknik yapabilirsiniz");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }
    }

}
