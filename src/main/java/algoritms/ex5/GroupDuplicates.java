package algoritms.ex5;

import java.util.*;

public class GroupDuplicates {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 1, 2, 1 };
        System.out.println(groupDuplicates(numbers));
    }
    public static List<Integer> groupDuplicates(int[] numbers){
        Map<Integer,Integer> countElement = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers){
            if (countElement.containsKey(number)){
                countElement.put(number,countElement.get(number)+1);
            }else {
                countElement.put(number,1);
            }
        }
        for (Integer number : numbers){
            for (int i = 0; i< countElement.get(number);i++){
                result.add(number);
            }
            countElement.put(number,0);

        }
       return result;
    }
}
