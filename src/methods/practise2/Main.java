package methods.practise2;

import java.util.Scanner;

public class Main {

    static int calculateFibonacci(int n){
        if (n ==1 || n == 2){
            return 1;
        }
        return calculateFibonacci(n-1) + calculateFibonacci(n-2);
    }

    public static void main(String[] args) {

        // Java'da recursive metotlar ile fibonacci serisi bulan program yapıyoruz.

        Scanner input = new Scanner(System.in);
        System.out.print("Kaçıncı eleman: ");
        int n = input.nextInt();
        System.out.println(calculateFibonacci(n));

    }

}
