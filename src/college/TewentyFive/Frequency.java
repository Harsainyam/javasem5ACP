package college.TewentyFive;

import java.util.*;

public class Frequency {

    public static void main(String[] args) {

        String input = "Hello World! 2023, Hello!!!";  // Sample input

        List<Character> result = getMostFrequentNonVowels(input);
        System.out.println("Characters with highest frequency (excluding vowels): " + result);
    }

    public static List<Character> getMostFrequentNonVowels(String str) {
        Set<Character> vowels = new HashSet<>(Arrays.asList(
                'a', 'e', 'i', 'o', 'u',
                'A', 'E', 'I', 'O', 'U'));
        Map<Character, Integer> freqMap = new HashMap<>();

        // Count frequency of each non-vowel character
        for (char c : str.toCharArray()) {
            if (!vowels.contains(c) && c != ' ') { // Skipping vowels and spaces
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }
        }

        // Find maximum frequency
        int maxFreq = 0;
        for (int freq : freqMap.values()) {
            if (freq > maxFreq) {
                maxFreq = freq;
            }
        }

        // Collect all chars with the maximum frequency
        List<Character> result = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                result.add(entry.getKey());
            }
        }

        return result;
    }
}