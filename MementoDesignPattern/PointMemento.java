package MementoDesignPattern;

public class PointMemento {
    // overhere you will define what all attributes you need to retrieve the state...
    private int x; 
    private int y;

    public PointMemento(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
