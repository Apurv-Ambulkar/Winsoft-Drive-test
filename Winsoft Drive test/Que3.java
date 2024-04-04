import java.util.HashMap;
import java.util.Map;

public class Que3 {

    public static Map<String, Integer> countWords(String str) {
        String[] words = str.split("\\P{L}+");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            String wordLowerCase = word.toLowerCase();
            wordCount.put(wordLowerCase, wordCount.getOrDefault(wordLowerCase, 0) + 1);
        }
        return wordCount;
    }

    public static void main(String[] args) {
        String text = "This is a test. This test is only a test.";
        Map<String, Integer> words = countWords(text);
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}