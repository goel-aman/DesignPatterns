package MediatorDesignPattern;

public interface AuctionMediator {
    public void addParticipant(Participant participant);
    public void triggerBid(int amount, String bidderName);
}
