package variables.practise5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Yarıçapı r, merkez açısısının ölçüsü 𝛼 olan daire diliminin
            alanı bulan programı yazınız. 𝜋 sayısını  = 3.14 alınız.
        */

        Scanner input = new Scanner(System.in);
        double radius, centralAngle, pi=3.14, area;

        System.out.print("Yarıçap: ");
        radius = input.nextDouble();
        System.out.print("Merkez açı: ");
        centralAngle = input.nextDouble();

        area = (pi*(radius*radius)*centralAngle) / 360;
        System.out.printf("Daire alanı: %.4f", area);
    }

}
