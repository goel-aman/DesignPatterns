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
        List<Coin> coins = vm.refundCoins();
        for(Coin coin: coins) {
            System.out.println("Refunded coin of value: " + coin.value);
        }

        vm.setCurrentState(new IdleState(vm));
    }

    @Override
    public void startDispense(VendingMachine vm, int shelfCode) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'startDispense'");
    }

    @Override
    public void chooseItem(VendingMachine vm, int shelfCode) {
        // assuming only one item can be selected at a time for simplicity...
        // check availability of item in inventory...
        Inventory inventory = vm.getInventory();
        List<ShelfItem> items = inventory.getItems();
        
        for(int i=0; i<items.size(); i++) {
            if(items.get(i).getShelfCode() == shelfCode && items.get(i).getItemsCount() > 0) {
                // item is available...
                int itemPrice = items.get(i).getItem().getPrice();
                if(itemPrice <= vm.getCoinsSum()) {
                    System.out.println("Item selected successfully. Proceeding to dispense...");
                    vm.setCurrentState(new DispenseState());                    
                } else {
                    System.out.println("Insufficient funds. please add more coins.");
                    // let more to has money state...
                    vm.setCurrentState(new HasMoneyState());
                }
            }
        }
    }
}
