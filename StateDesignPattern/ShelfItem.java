package StateDesignPattern;

public class ShelfItem {
    private int shelfId;
    private int shelfCode;
    private Item item;
    private int shelfCapacity;
    private int itemsCount;

    public ShelfItem(int shelfId, int shelfCode, Item item, int shelfCapacity, int itemsCount) {
        this.shelfId = shelfId;
        this.shelfCode = shelfCode;
        this.item = item;
        this.shelfCapacity = shelfCapacity;
        this.itemsCount = itemsCount;
    }

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
    
    public int getShelfCapacity() {
        return shelfCapacity;
    }
    
    public void setShelfCapacity(int shelfCapacity) {
        this.shelfCapacity = shelfCapacity;
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
