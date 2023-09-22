package exercitii.ex7;

import java.util.*;

public class CountWords {
    public static void main(String[] args) {
        List<String > words = Arrays.asList("ana","are","mere","are");
        System.out.println(groupWordsByFrecquency(words));

    }
    public static Map<String,Integer> groupWordsByFrecquency(List<String> words){
        Map<String,Integer> wordsByFrecquency = new HashMap<>();
        //parcurg lista si pentru fiecare element:
        //daca este deja acea cheie in lista
          //cresc valoarea de la acea cheie cu 1
        // daca nu este, adaug cheia cu valoarea 1 in mapa

        for (String word : words){
            if (wordsByFrecquency.containsKey(word)){
                wordsByFrecquency.put(word,wordsByFrecquency.get(word)+1);

            }else {
                wordsByFrecquency.put(word,1);
            }
        }
        return wordsByFrecquency;
    }
}
