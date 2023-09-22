package exercitii.ex13;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SpellChecker {
    public static void main(String[] args) {
        //introduce nr de cuvinte cunoscute din lista
        Scanner scanner = new Scanner(System.in);
        int knownWords = scanner.nextInt();
        scanner.nextLine();
        Set<String> dictionary = new HashSet<>();
        for (int i = 0; i < knownWords; i++){
            //pe cate o linie separata introduc fiecare cuvant cunoscut in lista
            String word = scanner.nextLine().toLowerCase();
            dictionary.add(word);

        }
        //introduc nr de linii al textului de verificat
        //scriu atatea linii de text iar cuvintele vor fi separtae prin spatiu
        int nrOfLinesToCheck = scanner.nextInt();
        scanner.nextLine();
        Set<String> checkWords = new HashSet<>();
        for (int i = 0 ; i < nrOfLinesToCheck; i++){
            String line = scanner.nextLine();
            String[] words = line.split(" ");
            for (String word : words){
                if (!dictionary.contains(word.toLowerCase())){
                    checkWords.add(word);
                }
            }

        }
        //afisam cuvintele gresite
        for (String word: checkWords){
            System.out.println(word);
        }

    }
}
