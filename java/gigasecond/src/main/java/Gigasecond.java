import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private static final long gigasecond = 1_000_000_000;

    private final LocalDateTime dateTime;

    Gigasecond(LocalDate moment) {
        this(moment.atStartOfDay());
    }

    Gigasecond(LocalDateTime moment) {
        dateTime = moment;
    }

    LocalDateTime getDateTime() {
        return dateTime.plusSeconds(gigasecond);
    }

}
