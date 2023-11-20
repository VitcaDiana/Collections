package algoritms.ex4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 7;
        int[] numbers = {3, 2, 1, 6, 5, 7};
        System.out.println(findMissingNumber(n,numbers));

    }
    public static int findMissingNumber(int n, int[] numbers){
        Arrays.sort(numbers);
        for (int i = 0 ; i< n-1; i++){
            if (numbers[i+1] -numbers[i] >1){
                return numbers[i]+1;
            }
        }
        return -1;
    }
}
