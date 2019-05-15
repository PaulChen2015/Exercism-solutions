import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.List;

class Scrabble {

    private final int score;

    private static final Map<Character, Integer> wordScores = getWordScores();

    private static Map<Character, Integer> getWordScores() {
        Map<Character, Integer> m = new HashMap<>();
        putMultipleKeys(m, Arrays.asList('A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'), 1);
        putMultipleKeys(m, Arrays.asList('D', 'G'), 2);
        putMultipleKeys(m, Arrays.asList('B', 'C', 'M', 'P'), 3);
        putMultipleKeys(m, Arrays.asList('F', 'H', 'V', 'W', 'Y'), 4);
        putMultipleKeys(m, Arrays.asList('K'), 5);
        putMultipleKeys(m, Arrays.asList('J', 'X'), 8);
        putMultipleKeys(m, Arrays.asList('Q', 'Z'), 10);
        return m;
    }

    private static <K, V> void putMultipleKeys(Map<K, V> map, List<K> keys, V v) {
        for (K k : keys) {
            map.put(k, v);
        }
    }

    Scrabble(String word) {
        score = calcuScore(word.toUpperCase());
    }

    private int calcuScore(final String word) {
        return IntStream.range(0, word.length())
                .map(i -> wordScores.get(word.charAt(i)))
                .sum();
    }

    int getScore() {
        return score;
    }

}
