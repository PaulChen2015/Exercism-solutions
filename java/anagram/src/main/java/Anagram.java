import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {

    private final String word;

    public Anagram(String word) {
        this.word = word;
    }


    public List<String> match(List<String> candidates) {

        if (isCapitalWord(word)) return Collections.emptyList();

        return candidates.stream()
                        .filter(s -> isAnagram(word, s))
                        .collect(Collectors.toList());
    }

    private boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] arr = new int[26];

        String ls1 = s1.toLowerCase();
        String ls2 = s2.toLowerCase();

        for (int i = 0; i < s1.length(); i++) {
            arr[ls1.charAt(i) - 'a']++;
            arr[ls2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) return false;
        }

        return true;
    }


    private boolean isCapitalWord(String w) {
        for (int i  = 0; i < w.length(); i++) {
            if (w.charAt(i) > 'Z' || w.charAt(i) < 'A') {
                return false;
            }
        }
        return true;
    }

}