package algoritms.ex2;

import java.util.ArrayList;
import java.util.List;

public class ReplaceElementOfArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        List<Integer> result = new ArrayList<>();
        int productLeft = 1;
        for (int i = 0; i < numbers.length; i++) {
            result.add(productLeft);
            productLeft *= numbers[i];
        }
        int productRight = 1;
        for (int i = numbers.length-1; i>=0;i--){
            productRight*= numbers[i];
        }
        System.out.println(result);
    }
}
