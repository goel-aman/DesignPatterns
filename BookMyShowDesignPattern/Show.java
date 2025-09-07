package BookMyShowDesignPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class Show {
    int showId;
    List<Seat> seats;
    Set<Seat> bookedSeats = new HashSet<>();
    Artist artist;
    int primaryPricing;
    int secondaryPricing;
    int tertiaryPricing;
    Location location;    

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public Set<Seat> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(Set<Seat> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public int getPrimaryPricing() {
        return primaryPricing;
    }

    public void setPrimaryPricing(int primaryPricing) {
        this.primaryPricing = primaryPricing;
    }

    public int getSecondaryPricing() {
        return secondaryPricing;
    }

    public void setSecondaryPricing(int secondaryPricing) {
        this.secondaryPricing = secondaryPricing;
    }

    public int getTertiaryPricing() {
        return tertiaryPricing;
    }

    public void setTertiaryPricing(int tertiaryPricing) {
        this.tertiaryPricing = tertiaryPricing;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
