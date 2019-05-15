import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

class IsbnVerifier {

    private Pattern pattern = Pattern.compile("\\d{9}[\\dX]");

    boolean isValid(String stringToVerify) {
        final String s = stringToVerify.replaceAll("-", "");
        Matcher m = pattern.matcher(s);
        if (!m.matches()) return false;

        int sum = IntStream.range(0, 9)
                .map(i -> (s.charAt(i) - '0') * (10 - i))
                .sum();

        char last = s.charAt(s.length()-1);

        sum += (last == 'X') ? 10 : last - '0';

        return sum % 11 == 0;
    }


}
