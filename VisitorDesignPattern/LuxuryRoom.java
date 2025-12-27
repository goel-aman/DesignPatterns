package VisitorDesignPattern;

public class LuxuryRoom implements RoomElement {

    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
    
}
