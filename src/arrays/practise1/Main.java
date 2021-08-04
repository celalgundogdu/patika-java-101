package arrays.practise1;

public class Main {

    public static void main(String[] args) {

        // Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız

        int[] array = { 1,2,3,4,5,6,7,8,9,10 };
        int n = array.length;
        double harmonicSum = 0.0;
        for (int i = 0; i < n; i++){
            harmonicSum += 1.0 / array[i];
        }
        double harmonicMean = n / harmonicSum;
        System.out.println(harmonicSum);

    }

}
