package AtmDesignProblem.MoneyWithdrawal;
import java.util.List;

import AtmDesignProblem.AtmMachine;
import AtmDesignProblem.Note;
import AtmDesignProblem.State;

public class ActionState implements State {

    @Override
    public void enterAccountDetails(Integer accountNumber, AtmMachine atmMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enterAccountDetails'");
    }

    @Override
    public void accountInformation(AtmMachine atmMachine) {
        atmMachine.getAccountService().displayAccountDetails(atmMachine.getAccountNumber());

        // after displaying account information, change state back to idle state.
        atmMachine.setCurrentState(new IdleState());
    }

    @Override
    public void withdrawMoneyClicked(AtmMachine atmMachine) {
        // change the state to money withdrawal state.
        atmMachine.setCurrentState(new WithdrawalState());
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
        
    }

    @Override
    public void depositeMoney(AtmMachine atmMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'depositeMoney'");
    }

    
    
}
