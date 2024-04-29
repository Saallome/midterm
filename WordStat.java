package midterm.salome_kikilashvili_2.task4;

import java.util.*;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        printUniqueWords(fantasyFormatData);
        printWordLengthFrequency(fantasyFormatData);
    }

    public static void printUniqueWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>();

        // Iterate through the list of words and add them to the set
        for (String word : words) {
            uniqueWords.add(word.toLowerCase()); // Convert to lowercase to ensure case-insensitive comparison
        }

        // Print the unique words
        System.out.println("Unique Words:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
        System.out.println();
    }

    public static void printWordLengthFrequency(List<String> words) {
        Map<Integer, Integer> wordLengthFrequency = new HashMap<>();

        // Count the frequency of words with each length
        for (String word : words) {
            int length = word.length();
            wordLengthFrequency.put(length, wordLengthFrequency.getOrDefault(length, 0) + 1);
        }

        // Print the word length frequency map
        System.out.println("Word Length Frequency:");
        for (Map.Entry<Integer, Integer> entry : wordLengthFrequency.entrySet()) {
            System.out.println("Length " + entry.getKey() + ": " + entry.getValue() + " words");
        }
    }
}
