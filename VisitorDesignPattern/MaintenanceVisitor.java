package VisitorDesignPattern;

public class MaintenanceVisitor implements RoomVisitor {

    @Override
    public void visit(DeluxeRoom room) {
        System.out.println("Performing maintenance on Deluxe Room");
    }

    @Override
    public void visit(LuxuryRoom room) {
        System.out.println("Performing maintenance on Luxury Room");
    }

    @Override
    public void visit(PresedentialRoom room) {
        System.out.println("Performing maintenance on presidential suite");
    }
    
}
