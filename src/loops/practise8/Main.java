package loops.practise8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Java'da döngüler kullanarak yıldızlar ile elmas yapınız.

        Scanner input = new Scanner(System.in);
        int row, space, star = 1;
        System.out.print("Satır sayısı: ");
        row = input.nextInt();
        space = row / 2;
        for (int i = 1; i <= row; i++){
            for (int j = space; j >= 1; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= star; k++){
                System.out.print("*");
            }
            System.out.println();
            if (i < row/2 + 1){
                space = space - 1;
                star = star + 2;
            } else {
                space = space + 1;
                star  = star - 2;
            }
        }

    }

}
