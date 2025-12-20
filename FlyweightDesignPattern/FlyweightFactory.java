package FlyweightDesignPattern;
import java.util.*;

public class FlyweightFactory {
    private Map<String, CharacterFlyweight> storeCharacterFlyweight;

    public CharacterFlyweight getCharacterFlyweight(Character value, int size, String font) {
        String key = value.toString() + Integer.toString(size) + font;
        
    }
}
