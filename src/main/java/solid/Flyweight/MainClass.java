package solid.Flyweight;

public class MainClass {
    public static void main(String[] args) {
        Character ch1 = CharacterFactory.createCharacter('t', FontType.ITALICS, 10);
        System.out.println("created char 1");
        Character ch2 = CharacterFactory.createCharacter('t', FontType.ARIAL, 20);
        System.out.println("created char 2");
        Character ch3 = CharacterFactory.createCharacter('t', FontType.ITALICS, 10);
        System.out.println("created char 3");
        Character ch4 = CharacterFactory.createCharacter('[', FontType.ARIAL, 50);
        System.out.println("created char 4");
        ch1.display(1,2);
        ch2.display(2,3);
        ch3.display(3,4);
        ch4.display(4,5);
    }
}
