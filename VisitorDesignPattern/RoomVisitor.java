package VisitorDesignPattern;

public interface RoomVisitor {
    public void visit(DeluxeRoom room);
    public void visit(LuxuryRoom room);
    public void visit(PresedentialRoom room);
}
