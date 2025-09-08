package BookMyShowDesignPattern;

import java.util.List;
import java.util.Map;

public class CategoryManager {
    List<Category> category;
    Map<Category, List<Show>> shows;
    BookSeats bookShow;


    public CategoryManager(List<Category> category, Map<Category, List<Show>> shows) {
        this.category = category;
        this.shows = shows;
    }

    public List<Show> getCategoryShow(Category category) {
        return shows.get(category);
    }

    public void showBook(List<Seat> seats, Show show, ) {

    }

    public List<Category> getCategory() {
        return category;
    }
    public void setCategory(List<Category> category) {
        this.category = category;
    }
    public Map<Category, List<Show>> getShows() {
        return shows;
    }
    public void setShows(Map<Category, List<Show>> shows) {
        this.shows = shows;
    }
    public BookSeats getBookShow() {
        return bookShow;
    }
    public void setBookShow(BookSeats bookShow) {
        this.bookShow = bookShow;
    }
}
