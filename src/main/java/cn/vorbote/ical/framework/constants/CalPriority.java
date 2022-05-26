package cn.vorbote.ical.framework.constants;

/**
 * This priority is specified as an integer in the range 0 to 9. A value of 0 specifies an undefined priority. A value
 * of 1 is the highest priority. A value of 2 is the second highest priority. Subsequent numbers specify a decreasing
 * ordinal priority. A value of 9 is the lowest priority.<br>
 *
 * A CUA with a three-level priority scheme of "HIGH", "MEDIUM", and "LOW" is mapped into this property such that a
 * property value in the range of 1 to 4 specifies "HIGH" priority. A value of 5 is the normal or "MEDIUM" priority. A
 * value in the range of 6 to 9 is "LOW" priority.<br>
 * Created at 5/16/2022 10:18 PM.
 *
 * @author vorbote
 */
public interface CalPriority {
    int NO_PRIORITY = 0;
    int HIGHEST_PRIORITY = 1;
    int MID_PRIORITY = 5;
    int LOWEST_PRIORITY = 9;
}
