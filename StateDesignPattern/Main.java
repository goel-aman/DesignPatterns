package StateDesignPattern;
import java.util.*;
public class Main {
    public static void main(String[] args) {


        Inventory inventory = new Inventory(createItemsList());
        VendingMachine vm = new VendingMachine(inventory);
        
        // now we are inserting coins in the machine.
        vm.getCurrentState().PressInsertCoin(vm, createInitialCoins());

        // now we are selecting an item.
        vm.getCurrentState().PressItemSelectionButton(vm);

        // now we are going to choose an item...
        vm.getCurrentState().chooseItem(vm, 102);

        // let dispense the itme...
        vm.getCurrentState().startDispense(vm, 102);

        // print remaining items in the inventory
        vm.getInventory().printShelfItemsAndCount();
    }

    public static List<Coin> createInitialCoins() {
        List<Coin> coins = new ArrayList<>();
        
        Coin coin1 = Coin.Dime;
        Coin coin2 = Coin.Quarter;
        Coin coin3 = Coin.Nickel;
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        return coins;
    }

    public static List<ShelfItem> createItemsList() {
        List<ShelfItem> items = new ArrayList<>();

        Item firstItem = new Item(10, 1, "coke", Type.SoftDrinks);
        ShelfItem item1 = new ShelfItem(1, 101, firstItem, 10, 3);

        Item secondItem = new Item(15, 2, "paracetamol", Type.Medicine);
        ShelfItem item2 = new ShelfItem(2, 102, secondItem, 10, 5);


        items.add(item1);
        items.add(item2);
        return items;
    }
}
