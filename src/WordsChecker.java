import java.util.*;

public class WordsChecker {
    private Set<String>wordsSet=new HashSet<>();
    private static String text;
    public WordsChecker(String text){
        this.text=text;
        List<String>wordsList= Arrays.asList(text.split("\\P{IsAlphabetic}+")) ;//загоняем массив в список
        wordsSet.addAll(wordsList);//загоняем список в множество
    }

    public boolean  hasWord(String word){
        if (wordsSet.contains(word)){
            return true;
        }
        return false;
    }
}
