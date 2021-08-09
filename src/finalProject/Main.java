package finalProject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Oyun Alani Satir sayisi : ");
        int row = input.nextInt();
        System.out.print("Oyun Alani Sutun sayisi : ");
        int column = input.nextInt();
        System.out.println("=============================");
        MineSweeper mineSweeper = new MineSweeper(row, column);
        mineSweeper.run();

    }

}
