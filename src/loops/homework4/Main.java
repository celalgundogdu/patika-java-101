package loops.homework4;

public class Main {

    public static void main(String[] args) {

        // Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.

        boolean isPrime;
        for (int i = 1; i < 100; i++){
            isPrime = true;
            if (i == 1){
                continue;
            }
            for (int j = 2; j < i; j++){
                if (i != j && i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i + " ");
            }
        }

    }

}
