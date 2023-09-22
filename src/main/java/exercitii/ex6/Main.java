package exercitii.ex6;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.add("ana");
        set1.add("are");
        set1.add("mere");

        set2.add("ana");
        set2.add("are");
        set2.add("mere");

        System.out.println(isSuperset(set1,set2));

    }
    public static Set<Boolean>  isSuperset(Set<String> set1, Set<String > set2){
        return Collections.singleton(set1.containsAll(set2) && !set1.equals(set2));


}
}
