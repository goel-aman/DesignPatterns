package StateDesignPattern.States;
import java.util.List;

import StateDesignPattern.Coin;
import StateDesignPattern.VendingMachine;
import StateDesignPattern.States.State;

public class IdleState implements State {
    public IdleState() {
        // do nothing...
    }

    @Override
    public void PressInsertCoin(VendingMachine vm, List<Coin> coins) {
        List<Coin> machineCoins = vm.getCoins();
        for(Coin coin: coins) {
            machineCoins.add(coin);
        }
        vm.setCoins(machineCoins);
        vm.setCurrentState(new HasMoneyState());
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
