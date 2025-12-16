package InventoryManagementSystem;
import java.util.*;

public class User {
    private String userId;
    private String username;
    private List<Address> addresses;
    
    public User(String userId, String username)  {
        this.userId = userId;
        this.username = username;
        this.addresses = new ArrayList<>();
    }

    public void addAddress(Address address) {
        this.addresses.add(address);
    }

    public List<Address> getAllAddresses() {
        return this.addresses;
    }
}


