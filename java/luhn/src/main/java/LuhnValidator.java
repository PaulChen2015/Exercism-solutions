class LuhnValidator {

    boolean isValid(String candidate) {
        
        candidate = candidate.replaceAll(" ", "");

        int len = candidate.length();

        if (len <= 1) return false;

        int sum = 0, n = 1;

        for (int i = len - 1; i >= 0; i--) {
            char c = candidate.charAt(i);
            if (!Character.isDigit(c)) return false;

            int m = Character.getNumericValue(c);

            if ((n & 1) == 0) {
                m += m;
                sum += m > 9 ? (m - 9) : m;
            } else {
                sum += m;
            }
            n++;
        }

        return (sum % 10) == 0;

    }

}
