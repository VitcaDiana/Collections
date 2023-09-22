package exercitii.ex12;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);
        numbers.add(5);
        numbers.add(5);
        findMinAndMax(numbers);
    }
    public static void findMinAndMax(List<Integer> numbers){
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(numbers);
        if (!treeSet.isEmpty()){
            int min = treeSet.first();
            int max = treeSet.last();
            System.out.println(min);
            System.out.println(max);
        }
        else {
            System.out.println("List is empty");
        }
    }
}
