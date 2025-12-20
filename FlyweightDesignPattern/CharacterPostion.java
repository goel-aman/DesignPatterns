package FlyweightDesignPattern;

public class CharacterPostion {
    CharacterFlyweight characterFlyweight;
    int xPosition;
    int yPosition;


    CharacterPostion(Character value, int size, String font, int xPosition, int yPosition) {
        this.characterFlyweight = FlyweightFactory.getCharacterFlyweight(value, size, font);
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public void updatePostion(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public void draw() {
        characterFlyweight.draw(xPosition, yPosition);
    }
}
