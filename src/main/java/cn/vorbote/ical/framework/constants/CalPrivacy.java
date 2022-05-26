package cn.vorbote.ical.framework.constants;

/**
 * CalendarPrivacy<br>
 * Created at 5/16/2022 8:29 PM.
 *
 * @author vorbote
 */
public enum CalPrivacy {

    PUBLIC("PUBLIC"),
    PRIVATE("PRIVATE"),
    CONFIDENTIAL("CONFIDENTIAL");

    private String value;

    CalPrivacy(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return getValue();
    }
}
