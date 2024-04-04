import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = userInput.nextLine();
        userInput.close();

        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (char ch : inputString.toCharArray()) {
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }

        // Display duplicate characters
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> ch : charCountMap.entrySet()) {
            if (ch.getValue() > 1) {
                System.out.println(ch.getKey() + " - " + ch.getValue() + " times");
            }
        }
    }
}