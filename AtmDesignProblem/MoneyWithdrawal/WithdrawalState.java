package AtmDesignProblem.MoneyWithdrawal;
import java.util.List;

import AtmDesignProblem.CoinWithdrawal.*;
import AtmDesignProblem.AtmMachine;
import AtmDesignProblem.Note;
import AtmDesignProblem.State;
import AtmDesignProblem.Withdraw;

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
        Withdraw withdrawChain = new WithdrawFiveHundred(
            new WithdrawHundred(
                new WithdrawFifty(
                    new WithdrawTwenty(
                        new WithdrawTen(
                            new WithdrawFive(
                                new WithdrawTwo(
                                    new WithdrawOne(null
                                    )
                                )
                            )
                        )
                    )
                )
            )
        );

        List<Note> notes = withdrawChain.withdraw(amount, atmMachine.getCashInventory());
        for(Note note: notes) {
            System.out.print(note.getValue().getValue() + " ");

            // reduce the count by one...
            atmMachine.getCashInventory().decrementNoteCount(note.getValue(), 1);
        }
        System.out.println("------");

        atmMachine.setAccountNumber(null);
        atmMachine.setCurrentState(new IdleState());

        return notes;
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

    @Override
    public void submit(AtmMachine atmMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'submit'");
    }

    
    
}
