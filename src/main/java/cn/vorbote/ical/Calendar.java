package cn.vorbote.ical;

import java.util.List;
import java.util.Optional;

/**
 * Calendar<br>
 * Created at 2022/5/16 17:27
 *
 * @author vorbote
 */
public final class Calendar {

    private String groupId;
    private String name;
    private String timezone;
    private CalendarMethod method;
    private CalendarScale scale;
    private List<CalendarEvent> events;

    public String export() {
        var calendarBuilder = new StringBuilder();
        calendarBuilder.append("BEGIN:VCALENDAR\n");
        calendarBuilder.append("PRODID:-//vorbote.cn//iCal(Java)v3.0.0//EN\n");
        calendarBuilder.append("VERSION:2.0\n");
        calendarBuilder.append("CALSCALE:");
        calendarBuilder.append(Optional.ofNullable(scale).orElse(CalendarScale.GREGORIAN).getValue());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
