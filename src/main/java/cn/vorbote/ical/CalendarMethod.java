package cn.vorbote.ical;

/**
 * CalendarMethod<br>
 * Created at 2022/5/16 17:29
 *
 * @author vorbote
 */
public enum CalendarMethod {

    PUBLISH("PUBLISH"),

    REQUIRED("REQUIRED");

    final String description;

    CalendarMethod(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
