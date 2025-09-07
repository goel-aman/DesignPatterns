package BookMyShowDesignPattern;

import java.util.List;
import java.util.Map;

public class BookMyShow {
    List<User> users;
    List<City> cities;
    Map<City, CategoryManager> categoryManagers;


    public BookMyShow(List<User> users, List<City> cities, Map<City, CategoryManager> categoryManager) {
        this.users = users;
        this.cities = cities;
        this.categoryManagers = categoryManager;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public List<User> getUsers() {
        return users;
    }


    public void setUsers(List<User> users) {
        this.users = users;
    }


    public List<City> getCities() {
        return cities;
    }


    public void setCities(List<City> cities) {
        this.cities = cities;
    }


    public Map<City, CategoryManager> getCategoryManagers() {
        return categoryManagers;
    }


    public void setCategoryManagers(Map<City, CategoryManager> categoryManagers) {
        this.categoryManagers = categoryManagers;
    }
}
