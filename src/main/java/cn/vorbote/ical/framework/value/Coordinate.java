package cn.vorbote.ical.framework.value;

import java.util.Objects;

/**
 * Geo<br>
 * Created at 5/16/2022 9:58 PM.
 *
 * @author vorbote
 */
public class Coordinate {

    /**
     * The longitude of this location.
     */
    private Double longitude;

    /**
     * The latitude of this location.
     */
    private Double latitude;

    /**
     * Generate a coordinate use the specified longitude and latitude.
     *
     * @param longitude The longitude of the location.
     * @param latitude  The latitude of the location.
     */
    public Coordinate(Double longitude, Double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    /**
     * Generate a coordinate use the default longitude and latitude.
     */
    public Coordinate() {
        this(0.0, 0.0);
    }

    /**
     * Get longitude.
     *
     * @return The longitude.
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Set longitude.
     *
     * @param longitude The longitude.
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * Get latitude.
     *
     * @return The latitude.
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Set latitude.
     *
     * @param latitude The latitude.
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return String.format("GEO:%f;%f\n", latitude, longitude);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coordinate)) return false;
        Coordinate that = (Coordinate) o;
        return longitude.equals(that.longitude) && latitude.equals(that.latitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(longitude, latitude);
    }
}
