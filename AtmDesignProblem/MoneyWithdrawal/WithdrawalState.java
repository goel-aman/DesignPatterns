package AtmDesignProblem.MoneyWithdrawal;
import java.util.List;

import AtmDesignProblem.AtmMachine;
import AtmDesignProblem.Note;
import AtmDesignProblem.State;

public class WithdrawalState implements State {

    @Override
    public void enterAccountDetails(Integer accountNumber, AtmMachine atmMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enterAccountDetails'");
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
        List<Note> notes = 
    }

    @Override
    public void cancelTransaction(AtmMachine atmMachine) {
        // reset the account number 
        atmMachine.setAccountNumber(null);

        atmMachine.setCurrentState(new IdleState());
    }

    @Override
    public void depositeMoney(AtmMachine atmMachine, List<Note> notes) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'depositeMoney'");
    }
    
}
