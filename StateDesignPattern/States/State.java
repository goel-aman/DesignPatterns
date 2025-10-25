package StateDesignPattern.States;
import StateDesignPattern.VendingMachine;
import StateDesignPattern.Coin;
import java.util.List;

public interface State {
    public void PressInsertCoin(VendingMachine vm, List<Coin> coins);
    public void AddMoreCoin(List<Coin> coins, VendingMachine vm);
    public void PressItemSelectionButton(VendingMachine vm);
    public void cancelProcess(VendingMachine vm);
    public void startDispense(VendingMachine vm, int shelfCode);
    public void chooseItem(VendingMachine vm, int shelfCode);
}
