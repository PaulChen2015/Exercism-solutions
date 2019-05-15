import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> signals = new ArrayList<>();
        for (Signal s : Signal.values()) {
            if (isBitOn(number, s.ordinal())) {
                signals.add(s);
            };
        }

        if (isBitOn(number, 4)) {
            Collections.reverse(signals);
        }

        return signals;
        
    }

    private boolean isBitOn(int n, int position) {
        return (n & 1 << position) != 0;
    }

}
