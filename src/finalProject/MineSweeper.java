package finalProject;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    private int row;
    private int column;
    private int[][] board;
    private int[][] mineMap;
    private int mineCount;
    private boolean isContinue = true;

    public MineSweeper(int row, int column){
        this.row = row;
        this.column = column;
        board = new int[row][column];
        mineMap = new int[row][column];
        mineCount = (row * column) / 4;
    }

    public boolean isValidPoint(int row, int column){
        return ((row >= 0 && column >= 0) && (row < board.length && column < board[0].length));
    }

    public void countAdjacentMines(int row, int column){
        if (row > 0 && mineMap[row-1][column] == -1){
            board[row][column]++;
        }
        if (row < this.row - 1 && mineMap[row+1][column] == -1){
            board[row][column]++;
        }
        if (column > 0 && mineMap[row][column-1] == -1){
            board[row][column]++;
        }
        if (column < this.column - 1 && mineMap[row][column+1] == -1){
            board[row][column]++;
        }
        if (board[row][column] == 0){
            board[row][column] = -2;
        }
    }


    public void run(){
        fillMine();
        Scanner input = new Scanner(System.in);
        int rowPoint,columnPoint;
        int trueChoice = 0;
        do {
            draw(board);
            System.out.print("Satir: ");
            rowPoint = input.nextInt();
            System.out.print("Sutun: ");
            columnPoint = input.nextInt();
            if (!isValidPoint(rowPoint, columnPoint)){
                System.out.println("Gecersiz Koordinat!");
            } else {
                if (mineMap[rowPoint][columnPoint] == -1){
                    System.out.println("Kaybettiniz!\n---Harita---");
                    draw(mineMap);
                    isContinue = false;
                } else{
                    countAdjacentMines(rowPoint, columnPoint);
                    trueChoice++;
                    if (trueChoice == (row * column) - mineCount){
                        System.out.println("Kazandınız!");
                        isContinue = false;
                    }
                }
            }
            System.out.println("--------------------");
        }while (isContinue);

    }

    public void fillMine(){
        Random rnd = new Random();
        int randomRow;
        int randomColumn;
        int counter = 0;
        while (counter < mineCount){
            randomRow = rnd.nextInt(row);
            randomColumn = rnd.nextInt(column);
            if (mineMap[randomRow][randomColumn] != -1){
                mineMap[randomRow][randomColumn] = -1;
                counter++;
            }
        }
    }

    public void draw(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                    System.out.printf("%4s", String.valueOf(arr[i][j]));
            }
            System.out.println();
        }
    }

}
