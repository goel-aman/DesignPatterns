package InventoryManagementSystem;
import java.util.*;

public class Cart {
    private String cartId;
    private List<Item> items;
    private String userId;

    Cart(String cartId, String userId) {
        this.cartId = cartId;
        this.userId = userId;
        this.items = new ArrayList<>();
    }

    public void clearCart() {
        this.items = new ArrayList<>();
    }

    public void addToCart(Item item) {
        items.add(item);
    }

    public boolean removeItemFromCart(Item item) {
        for(int i=0; i<items.size(); i++) {
            if(items.get(i).getItemId() == item.getItemId()) {
                items.remove(i);
                return true;
            }
        }

        return false;
    }

    public List<Item> getCartItems() {
        return items;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    
}
