package cn.vorbote.ical.framework.constants;

/**
 * CalendarMethod<br>
 * Created at 2022/5/16 17:29
 *
 * @author vorbote
 */
public enum CalMethod {

    PUBLISH("PUBLISH"),

    REQUIRED("REQUIRED");

    final String value;

    CalMethod(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
