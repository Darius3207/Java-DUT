package PZ_3;
import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		 ArrayList<String> words = new ArrayList<>(Arrays.asList("worlds", "dog", "cats", "school", "moon", "sun", "clouds"));
	     System.out.println("Input: " + words);
	     System.out.println("Result: " + capitalizePlurals(words));

	}
	
	public static ArrayList<String> capitalizePlurals(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (word.charAt(word.length() - 1) == 's') {
                words.set(i, Character.toUpperCase(word.charAt(0)) + word.substring(1, word.length()));
            }

        }
        return words;

    }

}
