package InventoryManagementSystem;
import java.util.*;

public class InventoryManager {
    // itemId, ivnetoryItem
    Map<String, InventoryItem> manager;
    Map<CategoryType, Set<InventoryItem>> itemsInCategory;

    public InventoryManager() {
        this.manager = new HashMap<>();
        this.itemsInCategory = new HashMap<>();
    }

    public InventoryItem getInventoryItem(String itemId) {
        return manager.get(itemId);
    }

    public void addToInventory(String itemId, InventoryItem item, CategoryType category) {
        manager.putIfAbsent(itemId, item);
        itemsInCategory.computeIfAbsent(category, k -> new HashSet<>()).add(item);
    }   

    public void removeItemFromInventory(String itemId, InventoryItem item, CategoryType category) {
        manager.remove(itemId);
        itemsInCategory.computeIfAbsent(category, k -> new HashSet<>()).remove(item);
    }

    public void addCategory(CategoryType category) {
        itemsInCategory.computeIfAbsent(category, k -> new HashSet<>());
    }

    public void removeCategory(CategoryType category) {
        itemsInCategory.remove(category);
    } 
}
