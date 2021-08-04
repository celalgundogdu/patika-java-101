package arrays.homework1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
            Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Dizi boyutu: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print(i+1 + ". Eleman: ");
            arr[i] = input.nextInt();
        }

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Sıralama: ");
        for (int item : arr){
            System.out.print(item + " ");
        }

        // Arrays.sort(arr);
        // System.out.println("Sıralama: " + Arrays.toString(arr));

    }

}
