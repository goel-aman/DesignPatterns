package VisitorDesignPattern;

public class DeluxeRoom implements RoomElement  {
    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
    
}
