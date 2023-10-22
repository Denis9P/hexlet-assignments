package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// BEGIN
class App {
    public static boolean scrabble(String letters, String word) {
        var lettersCount = 0;
        var countMatch = 0;
        var lettersLowCase = letters.toLowerCase();
        var wordLowCase = word.toLowerCase();
        List<String> lettersList = new ArrayList<>();
        List<String> wordList = new ArrayList<>();
        for (var i = 0; i < letters.length(); i++) {
            lettersList.add(lettersLowCase.substring(i, i + 1));
            lettersCount++;
        }
        for (var j = 0; j < word.length(); j++) {
            wordList.add(wordLowCase.substring(j, j + 1));
            if (lettersList.contains(wordList.get(j))) {
                countMatch++;
                lettersList.remove(wordList.get(j));
            }
        }
        if (word.length() == countMatch) {
            return true;
        } else {
            return false;
        }
    }
}
//END
