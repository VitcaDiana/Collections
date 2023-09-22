package exercitii.ex4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,-2,3,4,4,-5);
        List<Integer> list2 = List.of(1,-7,2);

        System.out.println(list1);
        System.out.println(list2);

        System.out.println( positiveNumbersOfList(list1,list2));



    }
    public static Set<Integer> positiveNumbersOfList(List<Integer> list1, List<Integer>list2){
        Set<Integer> result = new HashSet<>();
        for (Integer number : list1){
            if (number > 0){
                result.add(number);
            }
        }
        for (Integer number : list2){
            if (number > 0){
                result.add(number);
            }
        }
        return result;
    }
}
