package StateDesignPattern;
import java.util.List;
import StateDesignPattern.States.*;

public class VendingMachine {
    private State currentState;
    private Inventory inventory;
    List<Coin> coins;

    public VendingMachine(Inventory inventory) {
        this.inventory = inventory;
        this.currentState = new IdleState(this);
        List<Coin> coins = null;
    }

    public List<Coin> refundCoins() {
        List<Coin> refundedCoins = this.coins;
        this.coins = null;
        return refundedCoins;
    }

    public int getCoinsSum() {
        int sum = 0;
        for(Coin coin: this.coins) {
            sum += coin.value;
        }

        return sum;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }
}
