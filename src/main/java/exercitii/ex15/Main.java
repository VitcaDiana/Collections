package exercitii.ex15;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Character> inputChars = Arrays.asList('a', 'e', 'i', 'o', 'u', 'c', 'n', 'd', 'b', 's', 'l', 'm');
        List<Character> outputChars = Arrays.asList('s', 't', 'n', 'f', 'g', 'h', 'j', 'k', 'x', 'y', 'z', 'q');
        Cypher cypher = new Cypher(inputChars,outputChars);
        System.out.println(cypher.getCipherMap());
        System.out.println(cypher.encrypt("slab"));
        try {
            System.out.println(cypher.decrypt("bsjs"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
