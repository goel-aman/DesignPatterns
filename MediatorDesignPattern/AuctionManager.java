package MediatorDesignPattern;
import java.util.*;

public class AuctionManager implements AuctionMediator {
    List<Bidder> participants;

    public AuctionManager() {
        this.participants = new ArrayList<>();
    }

    @Override
    public void addParticipant(Participant participant) {
        participants.add((Bidder) participant);
    }

    @Override
    public void triggerBid(int amount, String bidderName) {
        for(Bidder p: participants) {
            if(p.bidderName != bidderName) {
                p.receiveBid(amount, bidderName);
            }
        }
    }

}