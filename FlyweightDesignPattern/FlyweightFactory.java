package FlyweightDesignPattern;
import java.util.*;

public class FlyweightFactory {
    private final static Map<String, CharacterFlyweight> storeCharacterFlyweight = new HashMap<>();

    public static CharacterFlyweight getCharacterFlyweight(Character value, int size, String font) {
        String key = value.toString() + Integer.toString(size) + font;

        CharacterFlyweight character = storeCharacterFlyweight.get(key);

        if(character == null) {
            CharacterFlyweight characterInstance = new CharacterFlyweight(value, size, font);
            character = characterInstance;
            // storing in map...
            storeCharacterFlyweight.put(key, characterInstance);
        }

        return character;
    }
}
