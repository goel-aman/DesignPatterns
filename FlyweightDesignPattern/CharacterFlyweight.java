package FlyweightDesignPattern;

public class CharacterFlyweight {
    private final Character value;
    private final int size;
    private final String font;

    CharacterFlyweight(Character value, int size, String font) {
        this.value = value;
        this.size = size;
        this.font = font;
    }

    public void draw(int positionX, int positionY) {
        System.out.println("Char: " + value + " Size: " + size + " Font: " + font);
    }
}
