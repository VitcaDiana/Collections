package exercitii.ex5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String > wordsList = new ArrayList<>();
        wordsList.add("ana");
        wordsList.add("nu");
        wordsList.add("are");
        wordsList.add("mere");

        List<String> reverseList = listOfReversedWords(wordsList);
        System.out.println(reverseList);

    }
    public static List<String> listOfReversedWords(List<String> wordsList){
        List<String> reverseList = new ArrayList<>();
        for (int i = wordsList.size() -1; i >=0; i--){
            if (wordsList.get(i).length() >=3){
                reverseList.add(wordsList.get(i));
            }
        }
        return reverseList;
    }

}
