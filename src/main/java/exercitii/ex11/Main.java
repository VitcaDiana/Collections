package exercitii.ex11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);
        numbers.add(5);
        numbers.add(5);
        System.out.println("Element duplicat:"+findDuplicate(numbers));
    }
    public static int findDuplicate(List<Integer> numbers){
        Set<Integer> singularNumber = new HashSet<>();
        //parcurgem fiecare element din lista
        //daca valoarea number este prezenta in singularNumber atunci metoda add va fi falsa
        //altfel va adauga valoarea si va returna true
        for (Integer number: numbers){
            if(!singularNumber.add(number)){
                return number;
            }
        }
        return -1;

    }
}
