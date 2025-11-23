package CompositeDesignPattern;

public class File implements FileSystem {

    String fileName;

    @Override
    public void ls() {
        System.out.println("file name is: " + fileName);
    }
}
