package VisitorDesignPattern;

public class BookingVisitor implements RoomVisitor {
    @Override
    public void visit(DeluxeRoom room) {
        System.out.println("Booking Deluxe Room");
    }

    @Override
    public void visit(LuxuryRoom room) {
        System.out.println("Booking Luxury Room");
    }

    @Override
    public void visit(PresedentialRoom room) {
        System.out.println("Booking Presidential Room");
    }
    
}
