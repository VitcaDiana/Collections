package algoritms.ex3;

import java.util.HashMap;
import java.util.Map;

public class ArrayContainsDuplicates {
    public static void main(String[] args) {
        int[] numbers = {6, 5, 6, 2, 3, 1};
        if (containsDuplicate(numbers)){
            System.out.println("Exista duplicate");
        }else{
            System.out.println("Nu exista duplicate");
        }
    }

    public static boolean containsDuplicate(int[] numbers) {
        Map<Integer, Integer> countElements = new HashMap<>();
        //parcurgem fiecare element din array
        //daca elementul exista in map inseamna ca avem duplicate
        //daca elementul nu exista in map in adaugam cu o aparitie
        for (Integer number : numbers) {
            if (countElements.containsKey(number)) {
                return true;
            } else {
                countElements.put(number, 1);
            }
        }
        return false;
    }
}




