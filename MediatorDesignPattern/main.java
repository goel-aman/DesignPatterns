package MediatorDesignPattern;

public class main {
    public static void main(String[] args) {

        AuctionManager auctionManager = new AuctionManager();

        Bidder bidder1 = new Bidder("Aman", auctionManager);
        Bidder bidder2 = new Bidder("Rahul", auctionManager);
        Bidder bidder3 = new Bidder("Mohit", auctionManager);

        auctionManager.addParticipant(bidder1);
        auctionManager.addParticipant(bidder2);
        auctionManager.addParticipant(bidder3);

        bidder1.bid(100);
        bidder2.bid(150);
        
    }
}
