package solid.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    public static Map<java.lang.Character, Character> map = new HashMap<>();
    public static Character createCharacter(char ch, FontType fontType, int size) {
        if(map.containsKey(ch)) {
            System.out.println("Inside cache condition");
            return map.get(ch);
        } else if(CharType.Alphabet.equals(getType(ch))) {
            Character documentCharacter = new DocumentCharacter(ch, fontType, size);
            map.put(ch, documentCharacter);
            return documentCharacter;
        } else {
            Character wordArtCharacter = new WordArtCharacter(ch, fontType, size);
            map.put(ch, wordArtCharacter);
            return wordArtCharacter;
        }
    }

    private static CharType getType(char ch) {
        if(((int)'a'<=(int)ch && (int)ch<=(int)'z') || ((int)'A'<=(int)ch && (int)ch<=(int)'Z')) {
            return CharType.Alphabet;
        } else {
            return CharType.WordArt;
        }
    }
}
