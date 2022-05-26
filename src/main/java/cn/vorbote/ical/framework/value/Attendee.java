package cn.vorbote.ical.framework.value;

import lombok.*;

import java.util.Optional;

/**
 * Attendee<br>
 * Created at 5/16/2022 11:21 PM.
 *
 * @author vorbote
 */
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public final class Attendee {

    /**
     * The email address of this attendee.
     */
    private String address;

    /**
     * The common or displayable name associated with the calendar address.
     */
    private String name;

    /**
     * The intended role that the attendee will have in the calendar component.
     */
    private String role;

    /**
     * The status of the attendee's participation.
     */
    private String partStat;

    /**
     * Indicating whether the favor of a reply is requested.
     */
    private Boolean rsvp;

    /**
     * Indicate the type of calendar user.
     */
    private String calendarUserType;

    /**
     * Indicate the groups that the attendee belongs to.
     */
    private String member;

    /**
     * Indicate the calendar users that the original request was delegated to.
     */
    private String delegateTo;

    /**
     * Indicate whom the request was delegated from.
     */
    private String delegateFrom;

    /**
     * Indicate who is acting on behalf of the "ATTENDEE".
     */
    private String sentBy;

    /**
     * Indicate the URI that points to the directory information corresponding to the attendee.
     */
    private String dir;

    @Override
    public String toString() {

        var result = "ATTENDEE" +
                Optional.ofNullable(name).map(v -> String.format(";CN=%s", v)).orElse("") +
                Optional.ofNullable(role).map(v -> String.format(";ROLE=%s", v)).orElse("") +
                Optional.ofNullable(partStat).map(v -> String.format(";PARTSTAT=%s", v)).orElse("") +
                Optional.ofNullable(rsvp).map(v -> String.format(";RSVP=%b", v)).orElse("") +
                Optional.ofNullable(calendarUserType).map(v -> String.format(";CUTYPE=%s", v)).orElse("") +
                Optional.ofNullable(member).map(v -> String.format(";MEMBER=%s", v)).orElse("") +
                Optional.ofNullable(delegateTo).map(v -> String.format(";DELEGATED-TO=%s", v)).orElse("") +
                Optional.ofNullable(delegateFrom).map(v -> String.format(";DELEGATED-FROM=%s", v)).orElse("") +
                Optional.ofNullable(sentBy).map(v -> String.format(";SENT-BY=%s", v)).orElse("") +
                Optional.ofNullable(dir).map(v -> String.format(";DIR=%s", v)).orElse("") +
                Optional.ofNullable(address).map(v -> String.format(":mailto:%s", v)).orElse("") +
                "\n";

        if ("ATTENDEE\n".equals(result)) {
            return "";
        }

        return result;
    }

}
