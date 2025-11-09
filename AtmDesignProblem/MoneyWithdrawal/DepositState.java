package AtmDesignProblem.MoneyWithdrawal;

import java.util.List;

import AtmDesignProblem.AtmMachine;
import AtmDesignProblem.Note;
import AtmDesignProblem.State;
import java.util.ArrayList;

public class DepositState implements State {

    List<Note> notesCollected;

    public DepositState() {
        notesCollected = new ArrayList<>();
    }

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'withdrawMoney'");
    }

    @Override
    public void cancelTransaction(AtmMachine atmMachine) {
        // refund all the money collected till this point...
        System.out.println("List Of Notes Refunded...");
        for(Note note: notesCollected) {
            System.out.println("Note is: " + note.getValue().getValue());
        }

        notesCollected.clear();

        // update the state of the machine to latest... 
    }

    @Override
    public void depositeMoney(AtmMachine atmMachine, List<Note> notes) {
        
    }
    

}
