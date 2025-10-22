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
}
