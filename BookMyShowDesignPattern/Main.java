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
        List<Category> categories = catManager.getAllCategories();

        // now user select a category 
        List<Show> shows = catManager.getCategoryShow(categories.get(0));

        // user selects a shows....
        // user needs to select seats now...

        Show selectedShow = shows.get(0);

        // display available seats to the user...
        List<Seat> availableSeats = selectedShow.getAvailableSeat();
        System.out.println("Available Seat Size is: " + availableSeats.size());

        for(int i=0; i<availableSeats.size(); i++) {
            System.out.println(availableSeats.get(i).seatId + " " + availableSeats.get(i).seatStatus);
        }
        System.out.println("--------");
        // lets select any two of them... first & second..

        List<Seat> selectedSeat = new ArrayList<>();
        selectedSeat.add(availableSeats.get(0));
        selectedSeat.add(availableSeats.get(1));

        // now user selects payment method...

        Payment paymentMethod = new UPIPayment();

        BookSeats bookSeats = new BookSeats(selectedSeat, selectedShow, paymentMethod);
        
        // generate bill..
        bookSeats.generateBill(PricingType.Level2);
        
        // initiate payment...
        bookSeats.initiatePayment();

        // finally reserve the seats...
        bookSeats.reserveSeats();

        // print available seats now?..

        selectedShow.getAvailableSeat().forEach(seat -> {
            System.out.println(seat.seatId + " " + seat.seatStatus);
        });
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

        Seat secondSeat = new Seat();
        secondSeat.seatId = 2;
        secondSeat.primaryPricing = 100;
        secondSeat.secondaryPricing = 250;
        secondSeat.tertiaryPricing = 350;
        secondSeat.seatStatus = SeatStatus.EMPTY;

        Seat thirdSeat = new Seat();
        thirdSeat.seatId = 3;
        thirdSeat.primaryPricing = 100;
        thirdSeat.secondaryPricing = 250;
        thirdSeat.tertiaryPricing = 350;
        thirdSeat.seatStatus = SeatStatus.EMPTY;

        seats.add(firstSeat);
        seats.add(secondSeat);
        seats.add(thirdSeat);

        Artist artist = new Artist(1, "Zakir Khan", 4);
        Location location = new Location("DLF Cyber City", 1, 424, 1234);

        Show firstShow = new Show(1, seats, artist, location);
        shows.add(firstShow);

        showMap.put(firstCategory, shows);
        return showMap;
    }
}
