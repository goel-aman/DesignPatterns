package StateDesignPattern.States;

import java.util.List;

import StateDesignPattern.Coin;
import StateDesignPattern.VendingMachine;

public class DispenseState implements State {

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
    public void startDispense(VendingMachine vm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'startDispense'");
    }

    @Override
    public void chooseItem(VendingMachine vm, int shelfCode) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chooseItem'");
    }
    
}
