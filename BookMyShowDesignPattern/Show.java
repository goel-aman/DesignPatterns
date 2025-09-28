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
    Location location;    

    public Show(int showId, List<Seat> seats, Artist artist, Location location) {
        this.showId = showId;
        this.seats = seats;
        this.artist = this.artist;
        this.location = location;
    }

    public List<Seat> getAvailableSeat() {
        List<Seat> ans = new ArrayList<>();

        for(Seat seat: seats) {
            System.out.println("Seat Id: " + seat.seatId + "Seat Status: " + seat.seatStatus);
            if(seat.seatStatus == SeatStatus.EMPTY) {                
                ans.add(seat);
            }
        }

        return ans;
    }

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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
