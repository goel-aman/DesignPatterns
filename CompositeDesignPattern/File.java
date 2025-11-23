package CompositeDesignPattern;

public class File implements FileSystem {
    String fileName;

    File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void ls() {
        System.out.println("file name is: " + fileName);
    }
}
