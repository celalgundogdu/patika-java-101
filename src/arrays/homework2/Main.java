package arrays.homework2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        Map<Integer, Integer> repeatedNumbers = new HashMap<>();
        int key, value;
        for (int i = 0; i < arr.length; i++){
            key = arr[i];
            value = 0;
            if (!repeatedNumbers.containsKey(key)){
                for(int j = 0; j < arr.length; j++){
                    if(key == arr[j]){
                        value++;
                    }
                }
                repeatedNumbers.put(key, value);
            }
        }

        System.out.println("Dizi: " + Arrays.toString(arr));
        System.out.println("Tekrar Sayıları: ");
        for(Integer k : repeatedNumbers.keySet()){
            System.out.println(k + " sayısı " + repeatedNumbers.get(k) + " kere tekrar edildi.");
        }

    }

}
