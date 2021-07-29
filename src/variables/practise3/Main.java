package variables.practise3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin
            alanını hesaplayan programı yazınız.
        */

        Scanner input = new Scanner(System.in);
        double edge1, edge2, edge3, perimeter, area;

        System.out.print("Birinci kenar uzunluğu: ");
        edge1 = input.nextDouble();

        System.out.print("İkinci kenar uzunluğu: ");
        edge2 = input.nextDouble();

        System.out.print("Üçüncü kenar uzunluğu: ");
        edge3 = input.nextDouble();

        perimeter = edge1 + edge2 + edge3;
        area = Math.sqrt(perimeter * (perimeter/2 - edge1) * (perimeter/2 - edge2) * (perimeter/2 - edge3));
        System.out.println("Üçgenin çevresi: " + perimeter);
        System.out.println("Üçgenin alanı: " + area);
    }

}
