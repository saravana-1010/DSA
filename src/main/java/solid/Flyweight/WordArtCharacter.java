package solid.Flyweight;

public class WordArtCharacter implements Character {
    private final char ch;
    private final FontType font;
    private final int size;

    public WordArtCharacter(char ch, FontType font, int size) {
        this.ch = ch;
        this.font = font;
        this.size = size;
    }

    public char getCh() {
        return ch;
    }

    public FontType getFont() {
        return font;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void display(int x, int y) {
        //
        System.out.println("Word art, x: " + x + ", y: " + y + ", char: " + ch);
    }
}
