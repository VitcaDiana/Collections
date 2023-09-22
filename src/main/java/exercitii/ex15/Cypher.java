package exercitii.ex15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cypher {
    private List<Character> inputChars;
    private List<Character> outputChars;

    private Map<Character, Character> cipherMap;

    public Cypher(List<Character> inputChars, List<Character> outputChars) {
        this.inputChars = inputChars;
        this.outputChars = outputChars;
        cipherMap = new HashMap<>();
        initializeCypher();
    }

    public List<Character> getInputChars() {
        return inputChars;
    }

    public void setInputChars(List<Character> inputChars) {
        this.inputChars = inputChars;
    }

    public List<Character> getOutputChars() {
        return outputChars;
    }

    public void setOutputChars(List<Character> outputChars) {
        this.outputChars = outputChars;
    }

    public Map<Character, Character> getCipherMap() {
        return cipherMap;
    }

    public void setCipherMap(Map<Character, Character> cipherMap) {
        this.cipherMap = cipherMap;
    }

    public void initializeCypher() {
        for (int i = 0; i < inputChars.size(); i++) {
            cipherMap.put(inputChars.get(i), outputChars.get(i));
        }
    }

    public String encrypt(String word) {
        //initial cuvantulcriptat e gol
        //parcurg cuvantul
        //pentru fiecare litera
        //iau valoarea de la acea litera(cheie)din mapa si o adaug in cuvantul criptat
        String encryptedWord = "";
        for (Character c : word.toCharArray()) {
            encryptedWord += cipherMap.get(c);

        }
        return encryptedWord;
    }

    public String decrypt(String word) throws Exception {
        String decryptedWord = "";
        //initial cuvantulcriptat e gol
        //parcurg cuvantul
        //pentru fiecare litera
        //caut unde este litera ca valoare in mapa
        //     parcurg setul de chei din mapa
        //     verific daca cheia curenta are ca si valoare litera
        //     daca da, adaug cheia de la acea valoare in decryptedWord

        for (Character c : word.toCharArray()) {
            decryptedWord += getKeyFromValue(c);
//            for (Character key : cipherMap.keySet()) {
//                if (cipherMap.get(key).equals(c)) {
//                    decryptedWord += key;
//                }
//            }
//        }


        }
        return decryptedWord;
    }

    public Character getKeyFromValue(Character value) throws Exception {
        for (Character key : cipherMap.keySet()) {
            if (cipherMap.get(key).equals(value)) {
                return key;
            }
        }
       throw new Exception("cannot decode");
    }
}

