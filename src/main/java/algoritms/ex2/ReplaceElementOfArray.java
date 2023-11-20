package algoritms.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceElementOfArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        List<Integer> result = new ArrayList<>();
        List<Integer> leftProducts = new ArrayList<>();
        List<Integer> rightProducts = new ArrayList<>();
        int productLeft = 1;
        for (int i = 0; i < numbers.length; i++) {
            leftProducts.add(productLeft);
            productLeft *= numbers[i];
        }
        int productRight = 1;
        for (int i = numbers.length - 1; i >= 0; i--) {
            rightProducts.add(0,productRight);
            productRight *= numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            result.add(leftProducts.get(i)*rightProducts.get(i));

        }
        System.out.println(result);
    }
}

        //var 2
//    int[] numbers = {1, 2, 3, 4, 5};
//
//    // calculam produsul tuturor elementelor din array
//    int totalProduct = 1;
//        for (Integer number : numbers) {
//        totalProduct *= num;
//    }
//
//    // inlocuim fiecare element cu produsul total impartit la elementul curent
//        for (int i = 0; i < numbers.length; i++) {
//        numbers[i] = totalProduct / numbers[i];
//    }
//
//        System.out.println("Output: " + Arrays.toString(numbers));
//}
//}

