package StateDesignPattern.States;

import java.util.List;

import StateDesignPattern.Coin;
import StateDesignPattern.VendingMachine;

public class HasMoneyState implements State {

    public HasMoneyState() {
        System.out.println("Vending Machine is in Has Money State");
    }

    @Override
    public void PressInsertCoin(VendingMachine vm, List<Coin> coins) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'PressInsertCoin'");
    }

    @Override
    public void AddMoreCoin(List<Coin> coins, VendingMachine vm) {
        List<Coin> currentCoins = vm.getCoins();
        for(Coin coin: coins) {
            currentCoins.add(coin);
        }

        vm.setCoins(currentCoins);
    }

    @Override
    public void PressItemSelectionButton(VendingMachine vm) {
        vm.setCurrentState(new SelectionState());
    }

    @Override
    public void cancelProcess(VendingMachine vm) {
        // TODO Auto-generated method stub

        // refune the money.
        List<Coin> coins = vm.refundCoins();
        for(Coin coin: coins) {
            System.out.println("Refunded coin of value: " + coin.value);
        }

        // set the state to idle state.
        vm.setCurrentState(new IdleState(vm));
    }

    @Override
    public void startDispense(VendingMachine vm, int shelfCode) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'startDispense'");
    }

    @Override
    public void chooseItem(VendingMachine vm, int shelfCode) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chooseItem'");
    }

}
