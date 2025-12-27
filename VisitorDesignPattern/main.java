package VisitorDesignPattern;

public class main {
    public static void main(String[] args) {
        RoomElement deluxeRoom = new DeluxeRoom();
        RoomElement luxuryRoom = new LuxuryRoom();

        RoomVisitor maintenance = new MaintenanceVisitor();
        RoomVisitor booking = new BookingVisitor();

        deluxeRoom.accept(maintenance);
        deluxeRoom.accept(booking);

        // Similarly you can extend function by adding more Visitor...
    }
}
