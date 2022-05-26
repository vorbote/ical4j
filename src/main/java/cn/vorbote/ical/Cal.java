package cn.vorbote.ical;

import cn.vorbote.ical.framework.constants.CalMethod;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Calendar<br>
 * Created at 2022/5/16 17:27
 *
 * @author vorbote
 */
public final class Cal {

    private String groupId;
    private String name;
    private String timezone;
    private CalMethod method;
    private Map<String, String> xProps;
    private List<? extends CalNode> nodes;

    public String export() {
        var calendarBuilder = new StringBuilder();
        calendarBuilder.append("BEGIN:VCALENDAR\n");
        calendarBuilder.append("PRODID:-//vorbote.cn//iCal4j v3.0.0//EN\n");
        calendarBuilder.append("VERSION:2.0\n");
        calendarBuilder.append("CALSCALE:GREGORIAN\n");
        calendarBuilder.append(String.format("METHOD:%s\n",
                Optional.ofNullable(method).orElse(CalMethod.PUBLISH).getValue()));
        calendarBuilder.append(String.format("X-WR-CALNAME:%s\n", Optional.ofNullable(name).orElse("")));
        calendarBuilder.append(String.format("X-WR-TIMEZONE:%s\n",
                Optional.ofNullable(timezone).orElse("Europe/London")));

        for (var node : nodes) {
            node.setGroupId(this.groupId);
            calendarBuilder.append(node.export());
        }

        calendarBuilder.append("END:VCALENDAR\n");
        return calendarBuilder.toString();
    }

    @Override
    public String toString() {
        return export();
    }
}
