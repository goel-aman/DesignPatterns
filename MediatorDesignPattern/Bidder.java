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
        mediator.triggerBid(amount, bidderName);
    }

    @Override
    public void receiveBid(int amount, String bidderName) {
       System.out.println("Bidder: " + this.bidderName + "received notification of bid amount of: " + amount);
    }
    
}
