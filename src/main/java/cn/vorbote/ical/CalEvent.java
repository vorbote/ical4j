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
        builder.append("UID:" + uid + "@" + groupId);

        return builder.toString();
    }

    public String toString() {
        return export();
    }

}
