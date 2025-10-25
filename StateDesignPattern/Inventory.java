package StateDesignPattern;
import java.util.List;

public class Inventory {
    List<ShelfItem> items;

    public Inventory(List<ShelfItem> items) {
        this.items = items;
    }

    public List<ShelfItem> getItems() {
        return items;
    }

    public void setItems(List<ShelfItem> items) {
        this.items = items;
    }

    public void printShelfItemsAndCount() {
        for(ShelfItem shelfItem: this.items) {
            System.out.println("Shelf Code: " + shelfItem.getShelfCode() + " Item Count: " + shelfItem.getItemsCount());
        }
    }
    
    public boolean decrementItemCount(int shelfCode) {
        for(ShelfItem shelfItem: this.items) {
            if(shelfCode == shelfItem.getShelfCode()) {
                boolean result = shelfItem.reduceItemsCount(1);
                if(result) {
                    System.out.println("Successfully decremented item count for shelf code: " + shelfCode);
                    return true;
                } else {
                    System.out.println("Failed to decrement item count for shelf code: " + shelfCode);
                    return false;
                }
            }
        }

        System.out.println("Shelf code not found: " + shelfCode);
        return false;
    }
}
