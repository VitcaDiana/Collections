package exercitii.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        wordList.add("ana");
        wordList.add("are");
        wordList.add("mere");
        wordList.add("hsajdsbasj");
        String longestWord = findLongestWord(wordList);
        System.out.println(wordList);
        System.out.println(longestWord);

    }
    public static String findLongestWord(List<String> wordList){
        String longestWord = " ";
        for (String word : wordList){
            if (word.length() > longestWord.length()){
                longestWord = word;
            }
        }
        return longestWord;
    }

}
