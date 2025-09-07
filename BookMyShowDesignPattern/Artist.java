package BookMyShowDesignPattern;

public class Artist {
    int artistId;
    String artistName;
    int rating;

    public Artist(int artistId, String artistName, int rating) {
        this.artistId = artistId;
        this.artistName = artistName;
        this.rating = rating;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
