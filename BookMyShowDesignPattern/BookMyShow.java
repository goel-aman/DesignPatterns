package BookMyShowDesignPattern;

import java.util.List;
import java.util.Map;
import java.util.*;

public class BookMyShow {
    List<User> users;
    Map<City, CategoryManager> categoryManagers;


    public BookMyShow(List<User> users, Map<City, CategoryManager> categoryManager) {
        this.users = users;
        this.categoryManagers = categoryManager;
    }

    public CategoryManager categoryManagerForCity(City city) {
        return categoryManagers.get(city);
    }

    public List<City> getAllCities() {
        return new ArrayList<>(categoryManagers.keySet());
    }
    
    public void addUser(User user) {
        users.add(user);
    }

    // Getters & Setters...
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Map<City, CategoryManager> getCategoryManagers() {
        return categoryManagers;
    }

    public void setCategoryManagers(Map<City, CategoryManager> categoryManagers) {
        this.categoryManagers = categoryManagers;
    }
}
