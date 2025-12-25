package MediatorDesignPattern;

public interface Participant {
    public void setMediator(AuctionMediator mediator);
    public void bid(int amount);
    public void receiveBid(int amount, String bidderName);
}
