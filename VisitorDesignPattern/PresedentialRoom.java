package VisitorDesignPattern;

public class PresedentialRoom implements RoomElement {
    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }

}
