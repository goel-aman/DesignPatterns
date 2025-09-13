package BookMyShowDesignPattern;

import java.util.*;;

public class Main {
    public static void main(String[] args) {
        List<User> users = createUsers();
        List<City> cities = createCities();
        
        BookMyShow bookingSystem = new BookMyShow(users, createCityCategoryMapping(cities));

        // we show user option for list of cities to chosse from...
        List<City> displayedCities = bookingSystem.getAllCities();

        CategoryManager catManager = bookingSystem.categoryManagerForCity(displayedCities.get(0));

        // user has selected a city - now ask to select a Cateogry.
                
    }

    public static List<User> createUsers() {
        User first = new User("aman goel", 0);
        User second = new User("rahul sharma", 1);

        List<User> users = new ArrayList<>();
        users.add(first);
        users.add(second);

        return users;
    }

    public static List<City> createCities() {
        List<City> cities = new ArrayList<>();
        City first = new City(0, "Delhi");
        cities.add(first);
        return cities;
    }

    public static Map<City, CategoryManager>  createCityCategoryMapping(List<City> cities) {
        Map<City, CategoryManager> cityCategoryMapping = new HashMap();

        for(City city: cities) {
            CategoryManager categoryManager = new CategoryManager(showMapping());
            cityCategoryMapping.put(city, categoryManager);
        }
    
        return cityCategoryMapping;
    }

    public static List<Category> createCategories() {
        List<Category> category = new ArrayList<>();

        Category firstCategory = new Category();
        firstCategory.categoryId = 1;
        firstCategory.categoryName = "Movies";

        Category secondCategory = new Category();
        secondCategory.categoryId = 2;
        secondCategory.categoryName = "Stand-Up Comedy";

        Category thirdCategory = new Category();
        thirdCategory.categoryId = 3;
        thirdCategory.categoryName = "Live Shows";

        category.add(firstCategory);
        category.add(secondCategory);
        category.add(thirdCategory);

        return category;
    }


    public static Map<Category, List<Show>> showMapping() {
        Map<Category, List<Show>> showMap = new HashMap<>();

        Category firstCategory = new Category();
        firstCategory.categoryId = 1;
        firstCategory.categoryName = "Movies";
        

        List<Show> shows = new ArrayList();
        List<Seat> seats = new ArrayList();
        Seat firstSeat = new Seat();
        firstSeat.seatId = 1;
        firstSeat.primaryPricing = 100;
        firstSeat.secondaryPricing = 200;
        firstSeat.tertiaryPricing = 300;
        firstSeat.seatStatus = SeatStatus.EMPTY;

        seats.add(firstSeat);

        Artist artist = new Artist(1, "Zakir Khan", 4);
        Location location = new Location("DLF Cyber City", 1, 424, 1234);

        Show firstShow = new Show(1, seats, artist, location);
        shows.add(firstShow);

        showMap.put(firstCategory, shows);
        return showMap;
    }
}
