package BookMyShowDesignPattern;

import java.util.List;
import java.util.Map;
import java.util.*;
public class CategoryManager {
    Map<Category, List<Show>> shows;

    public CategoryManager(Map<Category, List<Show>> shows) {
        this.shows = shows;
    }

    public List<Category> getAllCategories() {
        return new ArrayList<>(shows.keySet());
    }

    public List<Show> getCategoryShow(Category category) {
        return shows.get(category);
    }

    public Map<Category, List<Show>> getShows() {
        return shows;
    }

    public void setShows(Map<Category, List<Show>> shows) {
        this.shows = shows;
    }
}
