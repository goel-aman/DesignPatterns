package CompositeDesignPattern;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Directory secondaryFolder = new Directory("LLD Of Car Parking", null);
        List<FileSystem> list = new ArrayList<>();

        File delegatePattern = new File("Screenshot_1.jpeg");
        list.add(secondaryFolder);
        list.add(delegatePattern);

        Directory primaryFolder = new Directory("DesignPattern", list);

        primaryFolder.ls();
    }
}
