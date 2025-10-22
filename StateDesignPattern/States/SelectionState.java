package StateDesignPattern.States;

import java.util.List;

import StateDesignPattern.Coin;
import StateDesignPattern.Inventory;
import StateDesignPattern.VendingMachine;
import StateDesignPattern.ShelfItem;

public class SelectionState implements State {

    @Override
    public void PressInsertCoin(VendingMachine vm, List<Coin> coins) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'PressInsertCoin'");
    }

    @Override
    public void AddMoreCoin(List<Coin> coins, VendingMachine vm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'AddMoreCoin'");
    }

    @Override
    public void PressItemSelectionButton(VendingMachine vm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'PressItemSelectionButton'");
    }

    @Override
    public void cancelProcess(VendingMachine vm) {
        vm.refundCoins();
        vm.setCurrentState(new IdleState());
    }

    @Override
    public void startDispense(VendingMachine vm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'startDispense'");
    }

    @Override
    public void chooseItem(VendingMachine vm, int shelfCode) {
        // check availability of item in inventory...
        Inventory inventory = vm.getInventory();
        List<ShelfItem> items = inventory.getItems();

        for(int i=0; i<items.size(); i++) {
            if(items.get(i).getShelfCode() == shelfCode && items.get(i).getItemsCount() > 0) {
                // item is available...
                int itemPrice = items.get(i).getItem().getPrice();
            }
        }
    }
}
