import java.time.DayOfWeek;

import java.time.LocalDate;

public class Meetup {

    private int year;
    private int month;
    
    public Meetup(int month, int year) {
        this.year = year;
        this.month = month;
    }


    public LocalDate day(DayOfWeek dayOfWeek, MeetupSchedule schel) {
        LocalDate date = LocalDate.of(year, month, 1);

        return null;
    }
}