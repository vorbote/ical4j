package cn.vorbote.ical;

/**
 * CalendarEvent<br>
 * Created at 2022/5/16 17:32
 *
 * @author vorbote
 */
public final class CalEvent extends CalNode {
    public String export() {
        var builder = new StringBuilder();
        builder.append("BEGIN:VEVENT\n");
        builder.append("UID:19970901T130000Z-123401@example.com");

        return builder.toString();
    }

    public String toString() {
        return export();
    }

}
