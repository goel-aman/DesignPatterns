package MementoDesignPattern;
import java.util.*;

public class PointCareTaker {
    private List<PointMemento> mementoList;

    public PointCareTaker() {
        mementoList = new ArrayList<>();
    }

    public void addMemento(PointMemento memento) {
        mementoList.add(memento);
    }

    public PointMemento getLastMemento() {
        if (mementoList.isEmpty()) {
            return null;
        }
        
        return mementoList.remove(mementoList.size() - 1);
    }
}
