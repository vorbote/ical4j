package cn.vorbote.ical;

/**
 * CalendarScale<br>
 * Created at 2022/5/16 17:41
 *
 * @author vorbote
 */
public enum CalendarScale {

    GREGORIAN("GREGORIAN"),
    JULIAN("JULIAN"),
    GREGORIAN_US("GREGORIAN-US"),
    GREGORIAN_UK("GREGORIAN-UK"),
    JULIAN_US("JULIAN-US"),
    JULIAN_UK("JULIAN-UK"),
    ISO("ISO");

    private String value;

    CalendarScale(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
