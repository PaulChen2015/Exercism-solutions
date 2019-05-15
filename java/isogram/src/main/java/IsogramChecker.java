class IsogramChecker {

    boolean isIsogram(String phrase) {
        if (phrase == null) return false;

        boolean[] bls = new boolean[26];
        String str = phrase.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                if (bls[index]) {
                    return false;
                } else {
                    bls[index] = true;
                }
            }
            
        }

        return true;
    }


}
