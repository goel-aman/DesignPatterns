package InventoryManagementSystem;
import java.util.*;

public class Cart {
    String cartId;
    List<Item> items;
    String userId;

    Cart(String cartId, String userId) {
        this.cartId = cartId;
        this.userId = userId;
    }

    public void clearCart() {
        this.items = null;
    }

    public void addToCart(Item item) {
        items.add(item);
    }

    public boolean removeItemFromCart(Item item) {
        for(int i=0; i<items.size(); i++) {
            if(items.get(i).itemId == item.itemId) {
                items.remove(i);
                return true;
            }
        }

        return false;
    }
}
