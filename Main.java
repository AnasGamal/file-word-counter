import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        try {
            // take input from use
            Scanner takeFile = new Scanner(System.in);
            System.out.println("Enter filename: ");
            File file = new File(takeFile.nextLine());
            // read file entered by user
            takeFile = new Scanner(file);
            Map<String, Integer> words = new TreeMap<String, Integer>();
            Map<String, Integer> characters = new TreeMap<String, Integer>();
            int totalCharacters = 0;

            // read file line by line
            while (takeFile.hasNextLine()) {
                String line = takeFile.nextLine();
                String wordsList[] = line.split("[^a-zA-Z]+"); // split string of a line into array of words

                // iterate through each word
                for (String st : wordsList) {
                    if (!st.isEmpty()) {
                        String word = st.toLowerCase();
                        // check if the word already exist in the treemap
                        if (words.containsKey(word)) {
                            // increase frequency if already exists
                            words.put(word, words.get(word) + 1);
                        } else {
                            // if it doesn't already exist, set frequency to 1
                            words.put(word, 1);
                        }
                        // iterate through each character in the word currently being read
                        for (char c : st.toCharArray()) {
                            String charString = String.valueOf(c).toLowerCase();
                            if (characters.containsKey(charString)) {
                                characters.put(charString, characters.get(charString) + 1);
                            } else {
                                characters.put(charString, 1);
                            }
                        }
                    }
                }
            }

            // calculate number of total characters by adding occurrences
            for (int x : characters.values()) {
                totalCharacters += x;
            }

            // create a list of the words then sort it by frequency
            List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(words.entrySet());
            Collections.sort(sortedWords, (a, b) -> b.getValue().compareTo(a.getValue()));

            // create a list of the characters then sort it by frequency
            List<Map.Entry<String, Integer>> sortedChars = new ArrayList<>(characters.entrySet());
            Collections.sort(sortedChars, (a, b) -> b.getValue().compareTo(a.getValue()));

            System.out.println("Number of total characters: " + totalCharacters);
            System.out.println("Number of total words: " + words.size());

            // print each character and its occurrence
            System.out.println("The list of characters: ");
            for (Map.Entry<String, Integer> entry : sortedChars) {
                System.out.println("The character " + entry.getKey() + " appeared " + entry.getValue() + " times!");
            }

            // print each word and its occurrence
            System.out.println("The list of words: ");
            for (Map.Entry<String, Integer> entry : sortedWords) {
                System.out.println("The word " + entry.getKey() + " appeared " + entry.getValue() + " times!");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e);
        }
    }
}