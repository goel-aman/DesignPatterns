package CompositeDesignPattern;
import java.util.List;

public class Directory implements FileSystem {
    String directoryName;
    List<FileSystem> list;

    Directory(String directoryName, List<FileSystem> list) {
        this.directoryName = directoryName;
        this.list = list;
    }

    @Override
    public void ls() {
        System.out.println("Directory is: " + directoryName);
        if(list != null) {
            for(FileSystem element: list) {
                element.ls();
            }
        }
    }
}
