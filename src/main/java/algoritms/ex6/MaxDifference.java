package algoritms.ex6;

import java.util.ArrayList;
import java.util.List;

public class MaxDifference {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(2);
        number.add(7);
        number.add(9);
        number.add(5);
        number.add(1);
        number.add(3);
        number.add(5);
        System.out.println("Diferenta maxima dintre 2 numere este " +maxDifference(number));
    }
    public static int maxDifference(List<Integer> number){
        int minNr = number.get(0);
        int maxDifference = Integer.MIN_VALUE;
        for (int i = 1; i< number.size();i++){
            maxDifference = Math.max(maxDifference,number.get(i) - minNr);
            minNr = Math.min(minNr,number.get(i));
        }
        return maxDifference;
    }
}
