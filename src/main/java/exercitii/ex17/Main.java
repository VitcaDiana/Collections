package exercitii.ex17;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String word1 = "racec";
        String word2 = "carec";
        Map<Character, Integer> firstWordMap = generateMap(word1);
        Map<Character, Integer> secondWordMap = generateMap(word2);

        if (firstWordMap.equals(secondWordMap)) {
            System.out.println("anagrams");
        } else {
            System.out.println("not anagrams");
        }
        System.out.println(areAnagrams2(word1,word2));

    }

    public static boolean areAnagrams(String word1, String word2) {
        return generateMap(word1).equals(generateMap(word2));


    }

    public static boolean areAnagrams2(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        ArrayList<Character> charList1 = convert(word1);
        ArrayList<Character> charList2 = convert(word2);
        Collections.sort(charList1);
        Collections.sort(charList2);

        return charList1.equals(charList2);


    }

    public static ArrayList<Character> convert(String word) {
        ArrayList<Character> charList = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            charList.add(word.charAt(i));
        }
        return charList;
    }

    public static Map<Character, Integer> generateMap(String word) {
        Map<Character, Integer> wordMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            //fiecare litera o adaugam in map
            Character currentLetter = word.charAt(i);
            if (wordMap.containsKey(currentLetter)) {
                wordMap.put(currentLetter, wordMap.get(currentLetter) + 1);
            } else {
                wordMap.put(currentLetter, 1);
            }
        }
        return wordMap;
    }

}
