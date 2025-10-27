package AtmDesignProblem.MoneyWithdrawal;
import AtmDesignProblem.State;

import java.util.List;

import AtmDesignProblem.AtmMachine;
import AtmDesignProblem.Note;

public class IdleState implements State {

    @Override
    public void enterAccountDetails(Integer accountNumber, AtmMachine atmMachine) {
        // TODO Auto-generated method stub
        atmMachine.setAccountNumber(accountNumber);

        // once the account details are entered, change the state to action state.
        atmMachine.setCurrentState(new ActionState());

    }

    @Override
    public void accountInformation(AtmMachine atmMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'accountInformation'");
    }

    @Override
    public void withdrawMoneyClicked(AtmMachine atmMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'withdrawMoneyClicked'");
    }

    @Override
    public void depositMoneyClicked(AtmMachine atmMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'depositMoneyClicked'");
    }

    @Override
    public List<Note> withdrawMoney(AtmMachine atmMachine, Integer amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'withdrawMoney'");
    }

    @Override
    public void cancelTransaction(AtmMachine atmMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelTransaction'");
    }

    @Override
    public void depositeMoney(AtmMachine atmMachine, List<Note> notes) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'depositeMoney'");
    }

}
