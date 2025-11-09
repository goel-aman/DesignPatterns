package AtmDesignProblem;
import java.util.List;

public interface State {
    // functions for Idle State.
    public void enterAccountDetails(Integer accountNumber, AtmMachine atmMachine);

    // function for Action State.
    public void accountInformation(AtmMachine atmMachine);
    public void withdrawMoneyClicked(AtmMachine atmMachine);
    public void depositMoneyClicked(AtmMachine atmMachine);


    // function for Withdrawal State.
    public List<Note> withdrawMoney(AtmMachine atmMachine, Integer amount);

    // common to Action State, Withdrawal & Deposit State..
    public void cancelTransaction(AtmMachine atmMachine);

    // function for Deposit State...
    public void depositeMoney(AtmMachine atmMachine, List<Note> notes);

    // function when the deposited money gets finally submitted in machine...
    public void submit(AtmMachine atmMachine);
}