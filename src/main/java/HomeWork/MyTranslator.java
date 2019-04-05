package HomeWork;

import java.util.*;

public class MyTranslator {

    private Map<String, String> dictionary = new HashMap<>();

    void addNewWord(String en, String ru) {
        dictionary.put(en.toLowerCase(), ru);
    }

    String translate(String en) {
        return dictionary.getOrDefault(en.toLowerCase(), en);
    }

    public String translateSentence(String sentence) {
        List<String> world = Arrays.asList(sentence.split(" "));
        String translatedText = "";
        for (String word : world) {
            String translatedWorld = translate(word);
            translatedText += translatedWorld;
            translatedText += " ";
        }
        return translatedText;
    }

    final List<Integer> list = new ArrayList<>();

    public static void sort (List<Integer> list){
        for (int i = 0; i < list.size() ; i++) {
            for (int j = 0; j < list.size() ; j++) {
                if (i != j){
                    if (list.get(i)>list.get(j)){
                        Collections.swap(list,i,j);
                    }
            }
        }
        }
    }
}