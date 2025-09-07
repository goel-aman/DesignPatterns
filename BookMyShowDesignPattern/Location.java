package BookMyShowDesignPattern;

public class Location {
    String areaName;
    int locationId;
    int latitude;
    int longitude;

    public Location(String areaName, int locationId, int latitude, int longitude) {
        this.areaName = areaName;
        this.locationId = locationId;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getAreaName() {
        return areaName;
    }
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }
    public int getLocationId() {
        return locationId;
    }
    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }
    public int getLatitude() {
        return latitude;
    }
    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }
    public int getLongitude() {
        return longitude;
    }
    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    
}
