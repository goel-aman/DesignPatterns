package MediatorDesignPattern;

public class Bidder implements Participant {
    String bidderName;
    AuctionMediator mediator;

    public Bidder(String bidderName, AuctionMediator mediator) {
        this.bidderName = bidderName;
        this.mediator = mediator;
    }

    @Override
    public void setMediator(AuctionMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void bid(int amount) {
        //
    }

    @Override
    public void receiveBid(int amount, String bidderName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'receiveBid'");
    }
    
}
