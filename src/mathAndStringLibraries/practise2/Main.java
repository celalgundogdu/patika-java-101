package mathAndStringLibraries.practise2;

import java.util.Scanner;

public class Main {

    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        int indexFromEnd = str.length() - 1;
        for (int i = 0; i < indexFromEnd; i++){
            if (str.charAt(i) != str.charAt(indexFromEnd)){
                return false;
            }
            indexFromEnd--;
        }
        return true;
    }

    static boolean isPalindrome2(String str){
        str = str.toUpperCase();
        String reverseStr = "";
        for (int i = str.length()-1; i >= 0; i--){
            reverseStr += str.charAt(i);
        }
        return str.equals(reverseStr);
    }


    public static void main(String[] args) {

        // kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir program yazıyoruz.

        Scanner input = new Scanner(System.in);
        System.out.print("Kelime: ");
        String str = input.next();
        System.out.println("Palindrom: " + isPalindrome(str));
        System.out.println("Palindrom2: " + isPalindrome2(str));
    }

}
