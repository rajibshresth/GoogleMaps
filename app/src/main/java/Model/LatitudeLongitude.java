package Model;

public class LatitudeLongitude {

    private double lat;
    private double lon;
    private String marker;


    public LatitudeLongitude(double lat, double lng, String marker) {
        this.lat = lat;
        this.lon = lng;
        this.marker = marker;
    }


    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lon;
    }

    public void setLng(double lng) {
        this.lon = lng;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }





}
