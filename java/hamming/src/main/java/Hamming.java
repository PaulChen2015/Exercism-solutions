import java.util.stream.IntStream;

class Hamming {

    private final String leftStrand;
    private final String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        checkStrand();
    }

    private void checkStrand() {

        int leftLen = leftStrand.length();
        int rightLen = rightStrand.length();
        
        if (leftLen == 0 && rightLen != 0) {
            raiseException("left strand must not be empty.");
        }

        if (leftLen != 0 && rightLen == 0) {
            raiseException("right strand must not be empty.");
        }

        if (leftLen != rightLen) {
            raiseException("leftStrand and rightStrand must be of equal length.");
        }
    }

    private void raiseException(String msg) {
        throw new IllegalArgumentException(msg);
    }

    int getHammingDistance() {
        return (int)IntStream.range(0, leftStrand.length())
                        .filter(i -> leftStrand.charAt(i) != rightStrand.charAt(i))
                        .count();
    }

}
