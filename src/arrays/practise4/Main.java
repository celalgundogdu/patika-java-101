package arrays.practise4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    static boolean isFind(int[] arr, int value){
        for(int i : arr){
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
        Set<Integer> duplicate = new HashSet<>();
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (i != j && arr[i] == arr[j]){
                    duplicate.add(arr[i]);
                    break;
                }
            }
        }

        System.out.println(duplicate.toString());


    }

}
