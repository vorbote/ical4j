package cn.vorbote.ical;

import cn.vorbote.core.time.DateTime;
import cn.vorbote.core.time.TimeSpan;
import cn.vorbote.ical.framework.constants.CalPrivacy;
import cn.vorbote.ical.framework.value.Attendee;
import cn.vorbote.ical.framework.value.Coordinate;

import java.util.List;

/**
 * CalendarDataNode<br>
 * Created at 5/16/2022 8:40 PM.
 *
 * @author vorbote
 */
public abstract class CalNode {

    /**
     * Timezone of this data node.
     */
    protected String timezone;

    /**
     * This property is used to specify categories or subtypes of the calendar component. The categories are
     * useful in searching for a calendar component of a particular type and category. Within the
     * "{@link CalEvent}", or "{@link CalTodo}" calendar components,
     * more than one category can be specified as a <b>COMMA</b>-separated list of categories.
     * <br>
     * Example:
     * <ul>
     *     <li>
     *         <code>
     *             CATEGORIES:APPOINTMENT,EDUCATION
     *         </code>
     *     </li>
     *     <li>
     *         <code>
     *             CATEGORIES:MEETING
     *         </code>
     *     </li>
     * </ul>
     */
    protected List<String> categories;

    /**
     * An access classification is only one component of the general security system within a calendar
     * application. It provides a method of capturing the scope of the access the calendar owner intends for
     * information within an individual calendar entry. The access classification of an individual iCalendar
     * component is useful when measured along with the other security components of a calendar system (e.g.
     * , calendar user authentication, authorization, access rights, access role, etc.). Hence, the
     * semantics of the individual access classifications cannot be completely defined by this memo alone.
     * Additionally, due to the "blind" nature of most exchange processes using this memo, these access
     * classifications cannot serve as an enforcement statement for a system receiving an iCalendar object.
     * Rather, they provide a method for capturing the intention of the calendar owner for the access to the
     * calendar component. If not specified in a component that allows this property, the default value is
     * PUBLIC. Applications MUST treat x-name and iana-token values they don't recognize the same way as
     * they would the protected value.
     */
    protected CalPrivacy privacy;

    /**
     * This property is used to specify a comment to the calendar user.
     * <br>
     * Example:
     * <pre>COMMENT:The meeting really needs to include both ourselves
     * and the customer. We can't hold this meeting without them.
     * As a matter of fact\, the venue for the meeting ought to be at
     * their site. - - John</pre>
     */
    protected String comment;

    /**
     * This property provides a more complete description of the calendar component than that provided by
     * the "SUMMARY" property.
     */
    protected String description;

    /**
     * This property value specifies latitude and longitude, in that order (i.e., "LAT LON" ordering). The
     * longitude represents the location east or west of the prime meridian as a positive or negative real
     * number, respectively. The longitude and latitude values MAY be specified up to six decimal places,
     * which will allow for accuracy to within one meter of geographical position. Receiving applications
     * MUST accept values of this precision and MAY truncate values of greater precision.
     * <br>
     * Values for latitude and longitude shall be expressed as decimal fractions of degrees. Whole degrees
     * of latitude shall be represented by a two-digit decimal number ranging from 0 through 90. Entire
     * degrees of longitude shall be represented by a decimal number ranging from 0 through 180. When a
     * decimal fraction of a degree is specified, it shall be separated from the whole number of degrees by
     * a decimal point.
     * <br>
     * Latitudes north of the equator shall be specified by a plus sign (+), or by the absence of a minus
     * sign (-), preceding the digits designating degrees. Latitudes south of the Equator shall be
     * designated by a minus sign (-) preceding the digits designating degrees. A point on the Equator shall
     * be assigned to the Northern Hemisphere.
     * <br>
     * Longitudes east of the prime meridian shall be specified by a plus sign (+), or by the absence of a
     * minus sign (-), preceding the digits designating degrees. Longitudes west of the meridian shall be
     * designated by minus sign (-) preceding the digits designating degrees. A point on the prime meridian
     * shall be assigned to the Eastern Hemisphere. A point on the 180th meridian shall be assigned to the
     * Western Hemisphere. One exception to this last convention is permitted. For the special condition of
     * describing a band of latitude around the earth, the East Bounding Coordinate data element shall be
     * assigned the value +180 (180) degrees.
     * <br>
     * Any spatial address with a latitude of +90 (90) or -90 degrees will specify the position at the North
     * or South Pole, respectively. The component for longitude may have any legal value. Except the special
     * condition described above, this form is specified in [ANSI INCITS 61-1986].
     * <br>
     * The simple formula for converting degrees-minutes-seconds into decimal degrees is:
     * <code>decimal = degrees + minutes/60 + seconds/3600</code>.
     */
    protected Coordinate geo;

    /**
     * Specific venues such as conference or meeting rooms may be explicitly specified using this property.
     * An alternate representation may be specified that is a URI that points to directory information with
     * more structured specification of the location. For example, the alternate representation may specify
     * either an LDAP URL [RFC4516] pointing to an LDAP server entry or a CID URL [RFC2392] pointing to a
     * MIME body part containing a Virtual-Information Card (vCard) [RFC2426] for the location.
     */
    protected String location;

    /**
     * The property value is a positive integer between 0 and 100. A value of "0" indicates the to-do has
     * not yet been started. A value of "100" indicates that the to-do has been completed. Integer values
     * in between indicate the percent partially complete.
     *
     * When a to-do is assigned to multiple individuals, the property value indicates the percent complete
     * for that portion of the to-do assigned to the assignee or delegatee. For example, if a to-do is
     * assigned to both individuals "A" and "B". A reply from "A" with a percent complete of "70" indicates
     * that "A" has completed 70% of the to-do assigned to them. A reply from "B" with a percent complete of
     * "50" indicates "B" has completed 50% of the to-do assigned to them.
     */
    protected Integer percentComplete;

    /**
     * This priority is specified as an integer in the range 0 to 9. A value of 0 specifies an undefined
     * priority. A value of 1 is the highest priority. A value of 2 is the second highest priority.
     * Subsequent numbers specify a decreasing ordinal priority. A value of 9 is the lowest priority.<br>
     *
     * A CUA with a three-level priority scheme of "HIGH", "MEDIUM", and "LOW" is mapped into this property
     * such that a property value in the range of 1 to 4 specifies "HIGH" priority. A value of 5 is the
     * normal or "MEDIUM" priority. A value in the range of 6 to 9 is "LOW" priority.<br>
     *
     * You could use constant values in {@link cn.vorbote.ical.framework.constants.CalPriority}.
     */
    protected Integer priority;

    /**
     * The property value is an arbitrary text. More than one resource can be specified as a COMMA-separated list of
     * resources.
     */
    protected List<String> resources;

    /**
     * In a group-scheduled calendar component, the property is used by the "Organizer" to provide a confirmation of
     * the event to the "Attendees". <br>
     *
     * For example in a "VEVENT" calendar component, the "Organizer" can indicate that a meeting is <b>TENTATIVE</b>,
     * <b>CONFIRMED</b>, or <b>CANCELLED</b>. <br>
     *
     * In a "VTODO" calendar component, the "Organizer" can indicate that an action item <b>NEEDS-ACTION</b>,
     * <b>COMPLETED</b>, <b>IN-PROCESS</b> or <b>CANCELLED</b>.<br>
     *
     * <br>Available values for <b>event</b>:
     * <ul>
     *     <li><b>TENTATIVE</b> - Indicates event is tentative.</li>
     *     <li><b>CONFIRMED</b> - Indicates event is definite.</li>
     *     <li><b>CANCELLED</b> - Indicates event was cancelled.</li>
     * </ul>
     *
     * <br>Available values for <b>todo</b>:
     * <ul>
     *     <li><b>"NEEDS-ACTION"</b> - Indicates to-do needs action.</li>
     *     <li><b>"COMPLETED"</b> - Indicates to-do completed.</li>
     *     <li><b>"IN-PROCESS"</b> - Indicates to-do in process of.</li>
     *     <li><b>"CANCELLED"</b> - Indicates to-do was cancelled.</li>
     * </ul>
     */
    protected String status;

    /**
     * This property is used in the "VEVENT", "VTODO", and "VJOURNAL" calendar components to capture a short, one-line
     * summary about the activity or journal entry.
     */
    protected String summary;

    /**
     * This property defines the date and time that a to-do was actually completed.<br>
     *
     * Example:
     * <code>COMPLETED:19960401T150000Z</code>
     */
    protected DateTime completed;

    /**
     * Within the "VEVENT" calendar component, this property defines the date and time by which the event ends. The
     * value type of this property MUST be the same as the "DTSTART" property, and its value MUST be later in time than
     * the value of the "DTSTART" property. Furthermore, this property MUST be specified as a date with local time if
     * and only if the "DTSTART" property is also specified as a date with local time.
     */
    protected DateTime end;

    /**
     * This property defines the date and time before which a to-do is expected to be completed. For cases where this
     * property is specified in a "VTODO" calendar component that also specifies a "DTSTART" property, the value type of
     * this property MUST be the same as the "DTSTART" property, and the value of this property MUST be later in time
     * than the value of the "DTSTART" property. Furthermore, this property MUST be specified as a date with local time
     * if and only if the "DTSTART" property is also specified as a date with local time.<br>
     *
     * Example:
     * <code>DUE:19980430T000000Z</code>
     */
    protected DateTime due;

    /**
     * Within the "VEVENT" calendar component, this property defines the start date and time for the event.<br>
     *
     * Example:
     * <code>DTSTART:19980118T073000Z</code>
     */
    protected DateTime start;

    /**
     * In a "VEVENT" calendar component the property may be used to specify a duration of the event, instead of an
     * explicit end DATE-TIME. In a "VTODO" calendar component the property may be used to specify a duration for the
     * to-do, instead of an explicit due DATE-TIME. In a "VALARM" calendar component the property may be used to
     * specify the delay period prior to repeating an alarm. When the "DURATION" property relates to a "DTSTART"
     * property that is specified as a DATE value, then the "DURATION" property MUST be specified as a "dur-day" or
     * "dur-week" value.<br>
     *
     * Example:
     * <ul>
     *     <li><code>DURATION:PT1H0M0S</code></li>
     *     <li><code>DURATION:PT15M</code></li>
     * </ul>
     */
    protected TimeSpan duration;

    /**
     * Time Transparency is the characteristic of an event that determines whether it appears to consume time on a
     * calendar. Events that consume actual time for the individual or resource associated with the calendar SHOULD be
     * recorded as OPAQUE, allowing them to be detected by free/busy time searches. Other events, which do not take up
     * the individual's (or resource's) time SHOULD be recorded as TRANSPARENT, making them invisible to free/ busy
     * time searches.<br>
     * <hr>
     * Available values:
     * <ul>
     *     <li><code>TRANSP:TRANSPARENT</code></li>
     *     <li><code>TRANSP:OPAQUE</code></li>
     * </ul>
     *
     * Example:
     * <ul>
     *     <li><code>TRANSP:TRANSPARENT</code></li>
     *     <li><code>TRANSP:OPAQUE</code></li>
     * </ul>
     */
    protected String transparency;

    /**
     * This property MUST only be specified within calendar components to specify participants, non-participants, and
     * the chair of a group-scheduled calendar entity. The property is specified within an "EMAIL" category of the
     * "VALARM" calendar component to specify an email address that is to receive the email type of iCalendar alarm.<br>
     *
     * The property parameter "CN" is for the common or displayable name associated with the calendar address; "ROLE",
     * for the intended role that the attendee will have in the calendar component; "PARTSTAT", for the status of the
     * attendee's participation; "RSVP", for indicating whether the favor of a reply is requested; "CUTYPE", to
     * indicate the type of calendar user; "MEMBER", to indicate the groups that the attendee belongs to;
     * "DELEGATED-TO", to indicate the calendar users that the original request was delegated to; and "DELEGATED-FROM",
     * to indicate whom the request was delegated from; "SENT-BY", to indicate whom is acting on behalf of the
     * "ATTENDEE"; and "DIR", to indicate the URI that points to the directory information corresponding to the
     * attendee. These property parameters can be specified on an "ATTENDEE" property in either a "VEVENT", "VTODO",
     * or "VJOURNAL" calendar component. They MUST NOT be specified in an "ATTENDEE" property in a "VFREEBUSY" or
     * "VALARM" calendar component. If the "LANGUAGE" property parameter is specified, the identified language applies
     * to the "CN" parameter.<br>
     *
     * A recipient delegated a request MUST inherit the "RSVP" and "ROLE" values from the attendee that delegated the
     * request to them.<br>
     *
     * Multiple attendees can be specified by including multiple "ATTENDEE" properties within the calendar component.<br>
     */
    protected List<Attendee> attendees;

    /**
     * This property may be used in a calendar component to convey a location where a more dynamic rendition of the
     * calendar information associated with the calendar component can be found. This memo does not attempt to
     * standardize the form of the URI, nor the format of the resource pointed to by the property value. If the URL
     * property and Content-Location MIME header are both specified, they MUST point to the same resource.
     */
    protected String url;

    /**
     * The "UID" itself MUST be a globally unique identifier. The generator of the identifier MUST guarantee that the
     * identifier is unique. There are several algorithms that can be used to accomplish this. A good method to assure
     * uniqueness is to put the domain name or a domain literal IP address of the host on which the identifier was
     * created on the right-hand side of an "@", and on the left-hand side, put a combination of the current calendar
     * date and time of day (i.e., formatted in as a DATE-TIME value) along with some other currently unique (perhaps
     * sequential) identifier available on the system (for example, a process id number). Using a DATE-TIME value on
     * the left-hand side and a domain name or domain literal on the right-hand side makes it possible to guarantee
     * uniqueness since no two hosts should be using the same domain name or IP address at the same time. Though other
     * algorithms will work, it is RECOMMENDED that the right-hand side contain some domain identifier (either of the
     * host itself or otherwise) such that the generator of the message identifier can guarantee the uniqueness of the
     * left-hand side within the scope of that domain.
     */
    protected String uid;

    /**
     * The exception dates, if specified, are used in computing the recurrence set. The recurrence set is the complete
     * set of recurrence instances for a calendar component. The recurrence set is generated by considering the initial
     * "DTSTART" property along with the "RRULE", "RDATE", and "EXDATE" properties contained within the recurring
     * component. The "DTSTART" property defines the first instance in the recurrence set. The "DTSTART" property value
     * SHOULD match the pattern of the recurrence rule, if specified. The recurrence set generated with a "DTSTART"
     * property value that doesn't match the pattern of the rule is undefined. The final recurrence set is generated
     * by gathering all of the start DATE-TIME values generated by any of the specified "RRULE" and "RDATE" properties,
     * and then excluding any start DATE-TIME values specified by "EXDATE" properties. This implies that start DATE-TIME
     * values specified by "EXDATE" properties take precedence over those specified by inclusion properties (i.e.,
     * "RDATE" and "RRULE"). When duplicate instances are generated by the "RRULE" and "RDATE" properties, only one
     * recurrence is considered. Duplicate instances are ignored.<br/>
     *
     * The "EXDATE" property can be used to exclude the value specified in "DTSTART". However, in such cases, the
     * original "DTSTART" date MUST still be maintained by the calendaring and scheduling system because the original
     * "DTSTART" value has inherent usage dependencies by other properties such as the "RECURRENCE-ID".<br/>
     */
    protected List<DateTime> exceptDate;

    protected String groupId;

    /**
     * Set the group id for each data node.
     *
     * @param groupId The group id.
     */
    protected void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    protected String getGroupId() {
        return groupId;
    }

    /**
     * Export a string contains the data of the data node.<br>
     * The example of return:
     * <pre>
     *  BEGIN:VEVENT
     *  UID:19970901T130000Z-123401@example.com
     *  DTSTAMP:19970901T130000Z
     *  DTSTART:19970903T163000Z
     *  DTEND:19970903T190000Z
     *  SUMMARY:Annual Employee Review
     *  CLASS:protected
     *  CATEGORIES:BUSINESS,HUMAN RESOURCES
     *  END:VEVENT</pre>
     *
     * @return text of this node.
     */
    public abstract String export();

}
