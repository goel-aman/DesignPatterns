package StateDesignPattern.States;
import java.util.List;
import StateDesignPattern.Coin;
import StateDesignPattern.VendingMachine;
import StateDesignPattern.Inventory;
public class DispenseState implements State {

    public DispenseState() {
        System.out.println("Vending Machine is in Dispense State");
    }

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelProcess'");
    }

    @Override
    public void startDispense(VendingMachine vm, int shelfCode) {
        System.out.println("Dispensing item...");
        
        Inventory inventory = vm.getInventory();
        boolean result = inventory.decrementItemCount(shelfCode);
        if(result) {
            System.out.println("Item dispensed successfully.");
        } else {
            System.out.println("Failed to dispense item. Item may be out of stock.");
        }
        
        vm.setCurrentState(new IdleState(vm));
    }

    @Override
    public void chooseItem(VendingMachine vm, int shelfCode) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chooseItem'");
    }    
}
