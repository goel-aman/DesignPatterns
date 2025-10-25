package StateDesignPattern;

public class ShelfItem {
    private int shelfId;
    private int shelfCode;
    private Item item;
    private int capacity;
    private int itemsCount;

    public int getShelfId() {
        return shelfId;
    }
    
    public void setShelfId(int shelfId) {
        this.shelfId = shelfId;
    }
    
    public int getShelfCode() {
        return shelfCode;
    }
    
    public void setShelfCode(int shelfCode) {
        this.shelfCode = shelfCode;
    }
    
    public Item getItem() {
        return item;
    }
    
    public void setItem(Item item) {
        this.item = item;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public int getItemsCount() {
        return itemsCount;
    }

    public boolean reduceItemsCount(int value) {
        if(this.itemsCount < value) {
            return false;
        }

        this.itemsCount -= value;
        this.itemsCount = Math.max(0, this.itemsCount);
        return true;
    }
    
    public void setItemsCount(int itemsCount) {
        this.itemsCount = itemsCount;
    }
}
