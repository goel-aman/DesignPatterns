package MementoDesignPattern;

public class main {
    public static void main(String[] args) {

        PointCareTaker careTaker = new PointCareTaker();

        PointOriginator point = new PointOriginator(2, 3);

        // Save this snapshot...
        careTaker.addMemento(point.createMemento());

        point.setX(23);

        // save this snapshot...
        careTaker.addMemento(point.createMemento());

        careTaker.getLastMemento();
        point.restoreFromMemento(careTaker.getLastMemento());

        System.out.println("Current Point X: " + point.getX() + ", Y: " + point.getY());
    }
}
