package MementoDesignPattern;

public class PointOriginator {
    private int x;
    private int y;

    public PointOriginator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public PointMemento createMemento() {
        return new PointMemento(x, y);
    }

    public void restoreFromMemento(PointMemento memento) {
        this.x = memento.getX();
        this.y = memento.getY();
    }
}
