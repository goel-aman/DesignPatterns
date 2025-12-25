package MediatorDesignPattern;
import java.util.*;

public class AuctionManager implements AuctionMediator {
    List<Participant> participants;

    public AuctionManager() {
        this.participants = new ArrayList<>();
    }

    @Override
    public void addParticipant(Participant participant) {
        participants.add(participant);
    }

    @Override
    public void triggerBid(int amount, String bidderName) {
        for(Participant p: participants) {
            if(p != this) {
                p.receiveBid(amount, bidderName);
            }
        }
    }

}