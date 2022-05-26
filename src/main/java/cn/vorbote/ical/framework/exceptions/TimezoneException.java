package cn.vorbote.ical.framework.exceptions;

/**
 * TimezoneException<br>
 * Created at 2022/5/16 17:34
 *
 * @author vorbote
 */
public final class TimezoneException extends RuntimeException {

    public TimezoneException(String message) {
        super(message);
    }

    public TimezoneException() {
        super("Timezone value doesn't match regex requirement!");
    }
}
